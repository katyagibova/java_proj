package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] principle = new String[Integer.parseInt(scanner.nextLine())];
        int N = principle.length;

        for (int i = 0; i < N; i++) {
            principle[i] = scanner.nextLine();
        }
        String line = scanner.nextLine();

        Methods methods = new Methods(N, principle, line);
        methods.First(N);
        methods.Second(N);
    }
}
