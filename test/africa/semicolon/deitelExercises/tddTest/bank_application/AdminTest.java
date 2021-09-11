package africa.semicolon.deitelExercises.tddTest.bank_application;

import africa.semicolon.deitelExercises.tddTest.Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdminTest {
    Admin admin;
@BeforeEach
    void setUp(){
    admin = new Admin();
}
@AfterEach
    void cleanUp(){
    Account account = null;
    //admin.deleteCustomer(account.getAccountNumber());
    BankApp.getBankCustomerList().clear();
    admin = null;
}
@Test
    void testThatAdminHasPassword(){
    admin.setPassword(5588);
    assertEquals(5588, admin.getPassword());
}
@Test
    void testThatAdminHasUserName(){
    admin.setUserName("ifygreat");
    assertEquals("ifygreat",admin.getUserName());
}

@Test
    void testThatAdminCanViewCustomerSize(){
    try {
        Account customerAccount = new Account();
        BankCustomer customer1 = new BankCustomer("Joy", "Emoch", 3344, "08037355772", customerAccount);
        BankApp.addCustomerToList(customer1, 5000.00);
        System.out.println(customer1.toString());
        assertEquals(1, admin.getCustomerSize());
        Account customerAccount2 = new Account();
        BankCustomer customer2 = new BankCustomer("Buki", "Bala", 3333, "08037355775", customerAccount2);
        BankApp.addCustomerToList(customer2, 6500.00);
        System.out.println(customer2.toString());
        assertEquals(2, admin.getCustomerSize());
    }
    catch (IllegalAccessException ex){ex.getMessage();}

}
@Test
    void testThatAdminCanDeleteCustomer(){

    try {
        Account customerAccount = new Account();
        BankCustomer customer1 = new BankCustomer("Joy", "Emoch", 3344, "08037355772",customerAccount);
        BankApp.addCustomerToList(customer1, 5000.00);


        Account customerAccount2 = new Account();
        BankCustomer customer2 = new BankCustomer("Buki", "Bala", 3333, "08037355775",customerAccount2);
        BankApp.addCustomerToList(customer2, 6500.00);



        Account account3 = new Account();
        BankCustomer customer3 = new BankCustomer("Bose", "Bala", 3333, "08037355775",account3);
        BankApp.addCustomerToList(customer3, 6500.00);
        admin.viewAllCustomerDetails();

        admin.deleteCustomer(2);
        admin.viewAllCustomerDetails();
        assertEquals(2, BankApp.getBankCustomerList().size());
    }
    catch (IllegalAccessException ex){
        ex.getMessage();
    }
    catch (NullPointerException ex){
        System.out.println(ex.getMessage());
    }
}
@Test
    void testThatAdminCanViewCustomerDetails(){
    try {
        Account customerAccount = new Account();
        BankCustomer customer1 = new BankCustomer("Joy", "Emoch", 3344, "08037355772", customerAccount);
        BankApp.addCustomerToList(customer1, 5000.00);

        assertEquals(1, admin.getCustomerSize());
        Account customerAccount2 = new Account();
        BankCustomer customer2 = new BankCustomer("Buki", "Bala", 3333, "08037355775", customerAccount2);
        BankApp.addCustomerToList(customer2, 6500.00);
        //admin.viewAllCustomerDetails();

        Account account3 = new Account();
        BankCustomer customer3 = new BankCustomer("Buki", "Bala", 3333, "08037355775", account3);
        BankApp.addCustomerToList(customer3, 6500.00);
        admin.viewAllCustomerDetails();

    }catch (IllegalAccessException ex){
        System.out.println(ex.getMessage());
    }
}
@Test
    void thatCustomerHasAccountNumber(){
    Account customerAccount = new Account();
    BankCustomer customer1 = new BankCustomer("Joy", "Emoch", 3344, "08037355772",customerAccount);
    try {
        BankApp.addCustomerToList(customer1, 5000.00);
        assertEquals(1, customer1.getAccountNumber());
    }
    catch (IllegalAccessException ex){ex.getMessage();}

}
}
