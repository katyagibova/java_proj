package com.company;

public class Graph {
    private SystemSetup s1 = new SystemSetup();
    private SystemSetup s2 = new SystemSetup();
    private SystemSetup s3 = new SystemSetup();
    private SystemSetup s4 = new SystemSetup();
    private SystemSetup s5 = new SystemSetup();
    private SystemSetup firstState = s1;

    public Graph() {
        s1.addition(0, "create_project", s2);
        s1.addition(1, "add_library", s5);
        s2.addition(0, "test", s3);
        s2.addition(1, "drop_db", s4);
        s3.addition(0, "drop_db", s4);
        s3.addition(1, "add_library", s5);
        s4.addition(0, "restart", s3);
        s4.addition(1, "deploy", s5);
        s5.addition(0, "deploy", s1);
        s5.addition(1, "restart", s3);
    }

    public void employeeWork(int a) {
        for (int i = 0; i < firstState.getNumber().size(); i++) {
            if (firstState.getNumber().get(i) == a) {
                System.out.println(firstState.getAction().get(a));
                firstState = firstState.getNextState().get(a);
                break;
            }
        }
    }
}