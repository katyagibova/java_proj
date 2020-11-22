package proj_9;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Company topCompany = new Company();
        int a = (int) (Math.random()*70);
        Random r = new Random();
        for(int i=0; i<45; i++) {
            topCompany.hire(new Employee("Bob", "Black", LocalDate.of(r.nextInt(70) + 1930, r.nextInt(11) + 1, r.nextInt(28) + 1), "City" + r.nextInt(70), "8949912" + r.nextInt(78), r.nextInt(100000)));
        }

        topCompany.someMethod(new SelectorFixSalary(70000, 80000), (emp, index) -> System.out.println("fix salary " + index + ":" + emp));

        System.out.println();
        topCompany.someMethod(new SelectorCompany() {
            @Override
            public boolean selectCom(Employee emp) {
                return emp.getFixSalary() < 40_000;
            }
        }, new HeandlerCompany() {
            @Override
            public void handleComp(Employee emp, int index) {
                System.out.println("------" + index + "------");
                System.out.println(emp);
            }
        });
        System.out.println();

        SelectorCompany s = emp -> emp.getFixSalary() > 90000;
        topCompany.someMethod(s, Main::function);


    }
    static void function(Employee emp, int index){
        System.out.println("++++++" + index + "++++++");
        System.out.println(emp);
    }
}
