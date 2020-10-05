package com.company;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    ArrayList<Employee> employeeList = new ArrayList<>();

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

    public void someMethod(SelectorCompany selector, HeandlerCompany heandler){
        int count = 0;
        for( Employee employee: employeeList) {
            if (selector.selectCom(employee)) {
                heandler.handleComp(employee, count);
                count++;
            }
        }
        System.out.println(count);
    }

}
