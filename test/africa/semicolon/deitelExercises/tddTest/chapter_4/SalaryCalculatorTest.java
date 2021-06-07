package africa.semicolon.deitelExercises.tddTest.chapter_4;

import africa.semicolon.deitelExercises.tddTest.chapter_3.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {
    /*
    - An employee collects a particular amount for an hour, after 40 hours, the employee collects
    that same amount in 1 and 1/2 hours.
   - The program should have the employee's name, hourly salary, number of hours worked in a week
    - The program should calculate the employee's gross pay
     */
    void setUp(){
        SalaryCalculator salaryCalculator = new SalaryCalculator("James");
    }
    @Test
    void testToDetermineEmployeeHourlySalary(){
        SalaryCalculator salaryCalculator = new SalaryCalculator("James");
        salaryCalculator.setHourlysalary(300);
        assertEquals(300, salaryCalculator.getHourlySalary());
    }
    @Test
    void showTheHoursAnEmployeeWorkedInAWeek(){
        SalaryCalculator salaryCalculator = new SalaryCalculator("James");
        salaryCalculator.setNumberOfHoursWorked(30);
        assertEquals(30, salaryCalculator.getHoursWorked());
    }
    @Test
    void showThatEmployeeGrossPayForAStraight40HourIsTheSumOfHourlyPay(){
        SalaryCalculator salaryCalculator = new SalaryCalculator("James");
        salaryCalculator.setHourlysalary(300);
        salaryCalculator.setNumberOfHoursWorked(30);
        assertEquals(9000, salaryCalculator.getGrossPay(30));
    }
    @Test
    void showThatEmployeePayCannotBeAffectedByZeroOrNegativeValueOfPay(){
        SalaryCalculator salaryCalculator = new SalaryCalculator("James");
        salaryCalculator.setHourlysalary(-300);
        assertEquals(0, salaryCalculator.getGrossPay(30));
    }
    @Test
    void showThatEmployeePayCannotBeAffectedByZeroOrNegativeValueOfHours(){
        SalaryCalculator salaryCalculator = new SalaryCalculator("James");
       salaryCalculator.setHourlysalary(300);
       // salaryCalculator.setNumberOfHoursWorked(-30);
       assertEquals(0, salaryCalculator.getGrossPay(-30));
    }
    @Test
    void showThatAfter40HoursEmployeeGetsTheSamePayOf1HourForOneAndHalfHour(){
        SalaryCalculator salaryCalculator = new SalaryCalculator("James");
        salaryCalculator.setHourlysalary(300);
        salaryCalculator.setNumberOfHoursWorked(50);
        assertEquals(14000, salaryCalculator.getGrossPay(50));
    }
}
