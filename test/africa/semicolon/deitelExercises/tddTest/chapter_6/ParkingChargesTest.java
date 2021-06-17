package africa.semicolon.deitelExercises.tddTest.chapter_6;

/*
A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to de-
termine the charge for each customer.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingChargesTest {
    void setUp(){
        ParkingCharges charges = new ParkingCharges();
    }
    @Test
    void showChargesForACustomerNotAbove3Hours(){
        assertEquals(2, ParkingCharges.calculateCharges(3));
        assertEquals(2, ParkingCharges.calculateCharges(2));
        assertEquals(2, ParkingCharges.calculateCharges(1));
    }
    @Test
    void showCustomerMaximimPay(){
        assertEquals(10, ParkingCharges.calculateCharges(24));
    }
}
