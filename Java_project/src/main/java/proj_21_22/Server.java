package proj_21_22;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Server implements ItemsStore {
    static HttpClient httpClient = HttpClient.newHttpClient();
    static Gson gson = new Gson();
    String http = "http://80.87.199.76:3000/";





    @Override
    public List<Item> getAll() throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(http))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        List<Item> itemList = gson.fromJson(response.body(),List.class);
        return itemList;
    }

    @Override
    public Item get(int id) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(http +"/"+id))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(),Item.class);
    }

    @Override
    public Item addItem(Item item) throws IOException, InterruptedException {
        String str = gson.toJson(item);
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(str))
                .uri(URI.create(http))
                .setHeader("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(),Item.class);
    }

    @Override
    public Item editItem(int id, Item item) throws IOException, InterruptedException{
        String str = gson.toJson(item);
        System.out.println(str);
        HttpRequest request = HttpRequest.newBuilder()
                .PUT(HttpRequest.BodyPublishers.ofString(str))
                .uri(URI.create(http +"/"+id))
                .setHeader("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return get(item.getId());
    }

    @Override
    public void deleteItem(int id) throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create(http +"/"+id))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
