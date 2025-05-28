import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Employee> employees = addEmployees();
       printPayChecks(employees);
    }

    public static void printPayChecks(List<Employee> employees){
        if(employees == null  || employees.isEmpty()){
            System.out.println("No employees to print, please try again");
            return;
        }

        for(Employee employee: employees){
            System.out.println(employee);
            System.out.println("");
        }
    }

    public static List<Employee> addEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new MonthlyEmployee(1,"Frida Hanson", 24500.0));
        employees.add(new MonthlyEmployee(2,"Jacob Nielsen", 27500.0));

        employees.add(new HourlyEmployee(3,"Signe Højlund", 26.5,174));
        employees.add(new HourlyEmployee(4, "Tobias Strandmose", 122.25,200.25));

        employees.add(new CommissionEmployee(5,"Bjarne Larsen", 20000.0, 10000.0,0.20));
        employees.add(new CommissionEmployee(6,"Helene Petersen", 20000.0, 30000.0,0.25));

        return employees;
    }
}