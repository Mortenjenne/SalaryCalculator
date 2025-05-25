import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    private HourlyEmployee hourlyEmployee;

    @BeforeEach
    void setUp() {
        hourlyEmployee = new HourlyEmployee(1,"Signe Blomsterberg",16.5,167.25);
    }

    @Test
    void setNumberOfHours() {
        hourlyEmployee.setNumberOfHours(25.25);

        assertEquals(25.25,hourlyEmployee.getNumberOfHours());
    }

    @Test
    void setPayPrHour() {
        hourlyEmployee.setPayPrHour(325.75);

        assertEquals(325.75,hourlyEmployee.getPayPrHour());
    }

    @Test
    void calculateSalary() {
        double salary = 2759.63; //16.5 * 167.25 = 2759.625

        assertEquals(salary,hourlyEmployee.calculateSalary());
    }

    @Test
    void testZeroHours() {
        hourlyEmployee.setNumberOfHours(0);

        assertEquals(0, hourlyEmployee.calculateSalary());
    }

    @Test
    void calculateSalaryRoundsCorrectly() {
        hourlyEmployee.setNumberOfHours(167.255);
        hourlyEmployee.setPayPrHour(16.535);

        // Beregnet uden afrunding: 167.255 * 16.535 = 2765,56141
        // Afrundet til 2 decimaler: 2765,56
        double expected = 2765.56;

        assertEquals(expected, hourlyEmployee.calculateSalary());
    }
}