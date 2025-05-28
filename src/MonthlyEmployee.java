public class MonthlyEmployee extends Employee{

    private double salary;

    public MonthlyEmployee(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName);
        this.salary = salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public double calculateSalary() {
        return Math.round(salary * 100.0) / 100.0;
    }

    @Override
    public String toString (){
        return String.format("%s | Status: Monthly paid | Salary: %.2f kr.", super.toString(), calculateSalary());
    }
}
