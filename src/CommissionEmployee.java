public class CommissionEmployee extends Employee {

    private double baseSalary;
    private double salesAmount;
    private double commissionPercentage;

    public CommissionEmployee(int employeeId, String name, double baseSalary, double salesAmount, double commisionPercentage){
        super(employeeId,name);
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionPercentage = commisionPercentage;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public void setSalesAmount(double salesAmount){
        this.salesAmount = salesAmount;
    }

    public void setCommissionPercentage(double commissionPercentage){
        this.commissionPercentage = commissionPercentage;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public double getSalesAmount(){
        return this.salesAmount;
    }

    public double getCommissionPercentage(){
        return this.commissionPercentage;
    }

    @Override
    public double calculateSalary() {
        double provision = this.salesAmount * this.commissionPercentage;
        double salary = this.baseSalary + provision;
        return Math.round(salary * 100.0) / 100.0;
    }
}
