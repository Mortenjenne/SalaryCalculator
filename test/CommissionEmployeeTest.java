import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {
    private CommissionEmployee commissionEmployee;

    @BeforeEach
    void setUp() {
        commissionEmployee = new CommissionEmployee(1,"Sigurd Sigurdsen",19750.0,37950.75,0.15);
    }

    @Test
    void setBaseSalary() {
        commissionEmployee.setBaseSalary(20050.75);

        assertEquals(20050.75,commissionEmployee.getBaseSalary());
    }

    @Test
    void setSalesAmount() {
        commissionEmployee.setSalesAmount(35750.95);

        assertEquals(35750.95,commissionEmployee.getSalesAmount());
    }

    @Test
    void setCommissionPercentage() {
        commissionEmployee.setCommissionPercentage(0.25);

        assertEquals(0.25,commissionEmployee.getCommissionPercentage());
    }

    @Test
    void calculateSalary() {
        double salary = 25442.61;  //19750.0 + (37950.75 * 0.15) = 25442,6125

        assertEquals(salary,commissionEmployee.calculateSalary());
    }

    @Test
    void calculateSalaryWithZeroCommission() {
        commissionEmployee.setCommissionPercentage(0.0);
        double expectedSalary = commissionEmployee.getBaseSalary();

        assertEquals(expectedSalary, commissionEmployee.calculateSalary());
    }

    @Test
    void calculateSalary_withZeroSales() {
        commissionEmployee.setSalesAmount(0.0);
        double expectedSalary = commissionEmployee.getBaseSalary();

        assertEquals(expectedSalary, commissionEmployee.calculateSalary());
    }
}