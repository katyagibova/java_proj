package com.company;

public class TopManager implements EmployeePosition {
    Company company;

    public TopManager(Company company){
        this.company=company;
    }

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if(company.getIncome() >= 10000000){
            return baseSalary*2.5;
        }
        return baseSalary;
    }
}
