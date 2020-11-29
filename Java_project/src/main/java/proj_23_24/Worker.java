package proj_23_24;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {
    private Gson gson = new Gson();
    private HttpClient httpClient = HttpClient.newHttpClient();
    private int id = 1;
    private List<Task> taskList;
    private List<Report> reportList;
    private String localWay = "src/main/java/proj_23_24/db.json";
    private String networkWay = "http://80.87.199.76:3000/tasks/";
    private String outputWay = "http://80.87.199.76:3000/reports/";
    Type type = new TypeToken<ArrayList<Report>>() {}.getType();
    List<Report> report = null;


    public void performance() throws IOException, InterruptedException {

        try (FileReader fileReader = new FileReader(localWay)) {
            report = gson.fromJson(fileReader, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        reportList = report;

        while (true) {
            Type collectionType = new TypeToken<Collection<Task>>() {
            }.getType();
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(networkWay))
                    .build();
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            taskList = gson.fromJson(response.body(), collectionType);

            for (Task task : taskList) {
                if (updateCheck(task) && (task.getId() == id)) {
                    writingToFile(sendReport(worker(task.getExpression())));
                    id = id + 1;
                }
            }
            try {
                Thread.sleep((int) (Math.random() * 1000 + 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private double worker(String expression) {
        expression = expression.replace(" ", "");
        Pattern pattern = Pattern.compile("(?<one>[-]*\\d+)(?<sign>[*+/-])(?<two>[-]*\\d+)");
        Matcher matcher = pattern.matcher(expression);
        java.lang.System.out.println(expression);
        while (matcher.find()) {
            if (matcher.group("sign").contains("+"))
                return Integer.parseInt(matcher.group("one"))
                        + Integer.parseInt(matcher.group("two"));
            if (matcher.group("sign").contains("-"))
                return Integer.parseInt(matcher.group("one"))
                        - Integer.parseInt(matcher.group("two"));
            if (matcher.group("sign").contains("*"))
                return Integer.parseInt(matcher.group("one"))
                        * Integer.parseInt(matcher.group("two"));
            if (matcher.group("sign").contains("/"))
                return Math.ceil((100 *
                        Integer.parseInt(matcher.group("one"))
                        / Integer.parseInt(matcher.group("two"))))
                        / 100;
        }
        return 0;
    }

    private String sendReport(double answer) {
        Report report = new Report(id, answer);
        String json = gson.toJson(report);
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create(outputWay))
                .setHeader("Content-Type", "application/json")
                .build();
        try {
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        java.lang.System.out.println(json);
        return json;
    }

    private void writingToFile(String json) {
        StringBuilder sb = new StringBuilder();
        String str;
        try (BufferedReader reader = new BufferedReader(new FileReader(localWay))) {
            str = reader.readLine();
            while (!str.equals("]") && str != null) {
                sb.append(str);
                if (str.endsWith("}"))
                    sb.append(",");
                sb.append("\n");
                str = reader.readLine();
            }
            sb.append(json);
            try (PrintWriter writer = new PrintWriter(localWay)) {
                writer.write(sb.toString() + "\n]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean updateCheck(Task task) {
        for (Report report : reportList) {
            if (report.getTaskId() == task.getId()) {
                return false;
            }
        }
        return true;
    }
}