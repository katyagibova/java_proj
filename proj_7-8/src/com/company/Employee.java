package com.company;

public class Employee {
    double fixSalary;
    String name;
    String surname;
    EmployeePosition position;
    double finalSalary;

    public Employee(String name,String surname, double fixSalary, EmployeePosition position){
        this.name=name;
        this.surname=surname;
        this.fixSalary=fixSalary;
        this.position=position;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public String getSurname() {
        return surname;
    }
}
