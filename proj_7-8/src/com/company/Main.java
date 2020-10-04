package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Company topCompany = new Company();
        topCompany.hire(new Employee("Bob","Green", 25000, new Operator()));
        topCompany.hire(new Employee("Karl","Black", 100000, new TopManager(topCompany)));
        topCompany.hire(new Employee("Ann","White", 75000, new Manager()));

        List<Employee> stagerList = new ArrayList<>();
        for(int i=0;i<9;i++) {
            stagerList.add(new Employee("Karl " + i, "Black " + i, (int) (90000 + Math.random() * 110000), new TopManager(topCompany)));
        }
        for(int i=0;i<79;i++) {
            stagerList.add(new Employee("Ann " + i, "White " + i, (int) (45000 + Math.random() * 55000), new Manager()));
        }
        for(int i=0;i<179;i++) {
            stagerList.add(new Employee("Bob " + i, "Green " + i, (int) (15000 + Math.random() * 15000), new Operator()));
        }

        topCompany.hireAll(stagerList);
        topCompany.calcIncome();
        System.out.println("List of high salaries:");
        for(Employee emp : topCompany.getTopSalaryStaff(15)) {
            System.out.println(emp.getFinalSalary());
        }
        System.out.println();
        System.out.println("low salary list:");
        for(Employee emp : topCompany.getLowestSalaryStaff(30)) {
            System.out.println(emp.getFinalSalary());
        }
        System.out.println();

        topCompany.dismissal(-5);

        System.out.println();
        System.out.println("List of high salaries after dismissal:");
        for(Employee emp : topCompany.getTopSalaryStaff(15)) {
            System.out.println(emp.getFinalSalary());
        }
        System.out.println();
        System.out.println("low salary list after dismissal:");
        for(Employee emp : topCompany.getLowestSalaryStaff(30)) {
            System.out.println(emp.getFinalSalary());
        }


    }
}
