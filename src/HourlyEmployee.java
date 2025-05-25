public class HourlyEmployee extends Employee {

    private double numberOfHours;
    private double payPrHour;

    public HourlyEmployee(int employeeId, String name, double numberOfHours, double payPrHour){
        super(employeeId,name);
        this.numberOfHours = numberOfHours;
        this.payPrHour = payPrHour;
    }

    public void setNumberOfHours(double numberOfHours){
        this.numberOfHours = numberOfHours;
    }

    public void setPayPrHour(double payPrHour){
        this.payPrHour = payPrHour;
    }

    public double getNumberOfHours(){
        return this.numberOfHours;
    }

    public double getPayPrHour(){
        return this.payPrHour;
    }

    @Override
    public double calculateSalary() {
        double salary = this.numberOfHours * this.payPrHour;
        return Math.round(salary * 100.0) / 100.0;
    }
}
