public abstract class Employee {

    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee ID: " + this.employeeId + " | Name: " + this.employeeName;
    }
}
