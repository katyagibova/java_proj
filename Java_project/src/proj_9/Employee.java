package proj_9;

import java.time.LocalDate;

public class Employee {
        double fixSalary;
        String name;
        String surname;
        LocalDate date;
        String phone;
        String location;

        public Employee(String name, String surname, LocalDate date, String location, String phone, double fixSalary){
            this.name=name;
            this.surname=surname;
            this.date=date;
            this.location=location;
            this.phone=phone;
            this.fixSalary=fixSalary;
        }

    public double getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(double fixSalary) {
        this.fixSalary = fixSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fixSalary=" + fixSalary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
