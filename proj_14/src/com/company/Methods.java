package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {
    int N;
    private String[] principle;
    String line;

    public Methods(int N, String[] principle, String line) {
        N = N;
        this.principle = principle;
        this.line = line;
    }

    public void First (int N){
        String finalLine;
        String[] src = new String[N];
        String[] ptr = new String[N];
        finalLine = line;
        for (int i = 0; i < N; i++) {
            src[i] = principle[i].split(" ")[0];
            ptr[i] = principle[i].split(" ")[1];

            if (finalLine.contains(src[i])) finalLine = finalLine.
                    replaceAll(src[i], " " + ptr[i] + " ");
        }
        System.out.println("First: " + finalLine.replace(" ", ""));
    }

    public void Second (int N){
        String finalLine;
        String[] src = new String[N];
        String[] ptr = new String[N];
        finalLine = line;
        Pattern pattern = Pattern.compile("(?<src>\\w+) (?<ptr>\\w+)");
        for (int i = 0; i < N; i++) {
            Matcher matcher = pattern.matcher(principle[i]);
            if (matcher.find()) finalLine = finalLine.
                    replaceAll(matcher.group("src"),
                            " " + matcher.group("ptr") + " ");
        }
        System.out.println("Second: " + finalLine.replace(" ", ""));

    }
}
