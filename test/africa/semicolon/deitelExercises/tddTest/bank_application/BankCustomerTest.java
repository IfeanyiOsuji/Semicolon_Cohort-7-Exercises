package africa.semicolon.deitelExercises.tddTest.bank_application;

import africa.semicolon.deitelExercises.tddTest.Account;
import africa.semicolon.ecommemrce_system.test.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankCustomerTest {
    @Test
    void setUp(){
        Account customerAccount = new Account();
        BankCustomer customer = new BankCustomer("John","Kola", 3333, "08035071139", customerAccount);
    }
    @AfterEach
    void tearDown(){
        Account customerAccount = null;

        BankCustomer customer = null;
    }
    @Test
    void testThatCustomerHasFirstName(){
        BankCustomer customer = new BankCustomer();
        customer.setFirstName("John");
        assertEquals("John", customer.getFirstName());
        customer = null;
    }
    @Test
    void testThatCustomerHasLastName(){
        BankCustomer customer = new BankCustomer();
        customer.setLastName("Kola");
        assertEquals("Kola", customer.getLastName());
        customer = null;
    }
    @Test
    void testThatCustomerHasPhoneNumber(){
        BankCustomer customer = new BankCustomer();
        customer.setPhoneNumber("08035071139");
        assertEquals("08035071139", customer.getPhoneNumber());
        customer = null;
    }
    @Test
    void testThatCustomerHasAccount(){
        Account customerAccount = new Account();
        BankCustomer customer = new BankCustomer("John","Kola", 3333, "08035071139", customerAccount);
        assertEquals(customerAccount, customer.getMyAccount());
        customer = null;
        customerAccount = null;
    }


    @Test
    void testThatCustomerHasPassword(){
        BankCustomer customer = new BankCustomer();
        customer.setPassword(3333);
        assertEquals(3333, customer.getPassword());
        customer = null;
    }
    @Test
    void testThatCustomerCanDeposit(){
        BankCustomer customer = new BankCustomer();
        customer.deposit(1000);
        assertEquals(1000, customer.getBalance());
        customer = null;
    }
    @Test
    void testThatCustomerCanWithdraw(){
        BankCustomer customer = new BankCustomer();
        customer.deposit(1000);
        double amount = customer.withdraw(500.00);
        assertEquals(500.00, amount);
        customer = null;
    }
    @Test
    void testThatCustomerCanTransfer(){
        BankCustomer customer = new BankCustomer();
        customer.deposit(1000);
        Account kolaAccount = new Account();
        customer.transfer(500);
        assertEquals(500.00, customer.getBalance());
        customer = null;
    }
    @Test
    void testThatCustomerCanLoadCreditFromAccount(){
        BankCustomer customer = new BankCustomer();
        customer.deposit(1000);
        customer.setPhoneNumber("08035071139");
        customer.loadAirtime("08035071139", 500);
        assertEquals(500.00, customer.getBalance());
        customer = null;
    }
    @Test
    void testThatCustomerHasAccountNumber(){
        Account customerAccount = new Account();
        BankCustomer customer = new BankCustomer("John","Kola", 3333, "08035071139", customerAccount);
        Account customerAccount2 = new Account();
        BankCustomer customer2 = new BankCustomer("John","Kola", 3333, "08035071139", customerAccount2);

        Account customerAccount3 = new Account();
        BankCustomer customer3 = new BankCustomer("John","Kola", 3333, "08035071139", customerAccount3);
        assertEquals(3, customer3.getAccountNumber());
        assertEquals(1, customer.getAccountNumber());
        assertEquals(2, customer2.getAccountNumber());
    }

}
