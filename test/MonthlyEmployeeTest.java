import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MonthlyEmployeeTest {

    private MonthlyEmployee employee;

    @BeforeEach
    public void setUp() {
        employee = new MonthlyEmployee(1, "Hans Hansen", 24000.0);
    }

    @Test
    void setSalary() {
        employee.setSalary(30000.0);

        assertEquals(30000.0,employee.getSalary());
    }

    @Test
    void calculateSalary() {
        double expected = 24000.0;

        assertEquals(expected,employee.calculateSalary());
    }

    @Test
    void testCalculateSalaryWithDecimals() {
        employee.setSalary(19999.99);

        assertEquals(19999.99, employee.calculateSalary());
    }
}