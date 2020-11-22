package proj_9;

public class SelectorFixSalary implements SelectorCompany {
    private double salaryStart;
    private double salaryEnd;

    public SelectorFixSalary(double salaryStart, double salaryEnd) {
        this.salaryStart = salaryStart;
        this.salaryEnd = salaryEnd;
    }

    @Override
    public boolean selectCom(Employee emp) {
        return emp.getFixSalary() >= salaryStart && emp.getFixSalary() <= salaryEnd;
    }
}
