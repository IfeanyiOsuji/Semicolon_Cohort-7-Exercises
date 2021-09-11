package africa.semicolon.deitelExercises.tddTest.bank_application;

import africa.semicolon.deitelExercises.tddTest.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankAppTest {
    BankApp bankApp;
    @BeforeEach
    void setUp() {
        bankApp = new BankApp();
    }
    @Test
    void testThatBankCanCreateCustomer(){
        Account customerAccount = new Account();
        BankCustomer customer = new BankCustomer("Joy", "Emoch", 3344, "08037355772", customerAccount);
        try {
            bankApp.addCustomerToList(customer, 5000.00);
            ArrayList<BankCustomer> list = bankApp.getBankCustomerList();
            assertEquals(customer.toString(), list.get(0).toString());
        }
        catch (IllegalAccessException ex){ex.getMessage();}
    }
}