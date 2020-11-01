package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a == -1) {
                break;
            }
            graph.employeeWork(a);
        }
    }
}
