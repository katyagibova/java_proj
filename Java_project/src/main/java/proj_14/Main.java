package proj_14;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] principle = new String[Integer.parseInt(scanner.nextLine())];
        int N = principle.length;

        for (int i = 0; i < N; i++) {
            principle[i] = scanner.nextLine();
        }
        String line = scanner.nextLine();

        String str ="";
        for (int i = 0; i < principle.length; i++) {
            str+=principle[i].split(" ")[0];
            if (i != principle.length - 1)
                str+="|";
        }
        HashMap<String, String> replaceMap = new HashMap<>();
        for (String s : principle) {
            replaceMap.put(s.split(" ")[0], s.split(" ")[1]);
        }

        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(line);
        //System.out.println(matcher.replaceAll(mchr -> replaceMap.get(mchr.group())));

    }
}
