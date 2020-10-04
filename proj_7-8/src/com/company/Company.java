package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    ArrayList<Employee> employeeList = new ArrayList<>();
    public double income=0;

    public List<Employee> getTopSalaryStaff(int count)
    {
        if(!(count<=0 && count>employeeList.size())){
            employeeList.sort(Comparator.comparing(Employee::getFinalSalary).reversed());
            return employeeList.subList(0,count);
        }
        return null;
    }
    public List<Employee> getLowestSalaryStaff(int count)
    {
        if(!(count<=0 && count>employeeList.size())){
            employeeList.sort(Comparator.comparing(Employee::getFinalSalary));
            return employeeList.subList(0,count);
        }
        return null;
    }

    public void hire(Employee stager){
        employeeList.add(stager);
    }

    public void hireAll(List<Employee> stagers){
        for(Employee stg: stagers)
        {
            hire(stg);
        }
    }

    public void fire(Employee exWorker){
        employeeList.remove(exWorker);
    }

    public void calcIncome(){
        for(Employee worker: employeeList){
            if(worker.getPosition().getJobTitle().equals("Manager")) {
                worker.setFinalSalary(worker.getPosition().calcSalary(worker.getFixSalary()));
                income += (worker.getFinalSalary() - worker.getFixSalary()) * 20;
            }
        }
        for(Employee worker: employeeList){
            if(!worker.getPosition().getJobTitle().equals("Manager")){
                worker.setFinalSalary(worker.getPosition().calcSalary(worker.getFixSalary()));
            }
        }
    }

    public void dismissal(int count){
        if(!(count <= 0 && count > employeeList.size())) {
            for (int i = 0; i < count; i++) {
                fire(employeeList.get(employeeList.size()-1));
            }
        }
        else {
            System.out.println("Impossible to dismiss");
        }
    }

    public double getIncome(){
        return income;
    }
}
