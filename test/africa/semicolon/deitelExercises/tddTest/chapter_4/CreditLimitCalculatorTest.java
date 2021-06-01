package africa.semicolon.deitelExercises.tddTest.chapter_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitCalculatorTest {
    /*
        Pseudocode
        1. The customer should have an account number
        2. The customer should have an initial balance at the beginning of the month
        3. There should be total of all items charged by the customer for the current month;
        4. There should be a total of all credits applied to the customer's account this month
        5. There should be an allowable credit limit
     */
    CreditLimitCalculator limitCalculator;
    @BeforeEach
    void setUp(){
        limitCalculator = new CreditLimitCalculator(1232, 40000, 20000, 50000, 100000);
    }
    @Test
    void checkIfAccountBalanceIsSet(){
        limitCalculator.setAccountNumber(1232);
        assertEquals(1232, limitCalculator.getAccountNumber());
    }
    @Test
    void checkCustomerHasInitialBalance(){
        assertEquals(45000, limitCalculator.getInitialBalance());
    }
    @Test
    void checkIfUserHasNumberOfItemsChargedPerMonth(){
        assertEquals(20000, limitCalculator.getNumberOfItemsChargedPerMonth());
    }
    @Test
    void testIfNumberOfItemsChargedPerMonthCanBeSet(){
        limitCalculator.setNumberOfItemsChargedPerMonth(5000);
        assertEquals(100, limitCalculator.getNumberOfItemsChargedPerMonth());
    }
    @Test
    void testUsersTotalCredit(){
        assertEquals(50000, limitCalculator.getTotalCredit());
    }
    @Test
    void testUsersAllowableCredit(){
        assertEquals(100000, limitCalculator.getAllowableCredit());
    }
    @Test
    void testToCalculateUsersNewBalance(){
        assertEquals(40000, limitCalculator.getNewbalance());
    }
    @Test
    void testIfUsersCreditLimitisExceeded(){
        assertTrue(limitCalculator.isNewBalanceAboveCreditLimit(5000));
    }
    @Test
    void secondTestIfUsersCreditLimitisExceeded(){
        assertFalse(limitCalculator.isNewBalanceAboveCreditLimit(100));
    }
}
