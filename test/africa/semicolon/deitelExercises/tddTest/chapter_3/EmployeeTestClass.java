package africa.semicolon.deitelExercises.tddTest.chapter_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTestClass {
    Employee employee = new Employee("Joy","Kalu", 79000.00);
    Employee bola = new Employee("Bola", "Osho", 100000.00);
    @Test
    public void testThatEmployeeSlaryDoesNotAcceptNegativeValue(){
        employee.setMonthlySalary(-5000.00);
        assertEquals(79000.00, employee.getMonthlySalary());
    }
    @Test
    public void testToDetermineEmployeeYearlySalary(){
        assertEquals(1200000.00, bola.yearlySalary());
        assertEquals(948000.00, employee.yearlySalary());
    }
    @Test
    public void testToShowEmployeePercentageRaise(){
        assertEquals(86900, employee.percentageRaiseInSalary(10));
        assertEquals(110000,bola.percentageRaiseInSalary(10));

        assertEquals(1320000.00, bola.yearlySalary());
        assertEquals(1042800.00, employee.yearlySalary());

    }
}
