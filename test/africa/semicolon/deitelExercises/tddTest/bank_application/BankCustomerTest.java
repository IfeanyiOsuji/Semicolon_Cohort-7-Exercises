package africa.semicolon.deitelExercises.tddTest.bank_application;

import africa.semicolon.ecommemrce_system.test.Customer;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    void setUp(){
        BankCustomer customer = new BankCustomer("John", 3333);
    }
}
