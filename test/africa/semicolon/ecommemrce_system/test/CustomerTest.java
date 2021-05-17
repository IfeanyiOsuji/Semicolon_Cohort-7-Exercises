package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomerCreation(){
        Customer customer = new Customer();
    }
    @Test
    public void testCustomerID(){
        Customer customer = new Customer();
        customer.setCustomerID("SD123");
        assertEquals("SD123", customer.getCustomerID());
    }
    @Test
    public void testCustomerTitle(){
        Customer customer = new Customer();
        customer.settitle("Mr");
        assertEquals("Mr", customer.getTitle());
    }
    @Test
    public void testCustomerFirstName(){
        Customer customer = new Customer();
        customer.setFirstNmae("Bayo");
        assertEquals("Bayo", customer.getFirstName());
    }
    @Test
    public void testCustomerLastName(){
        Customer customer = new Customer();
        customer.setLastName("Tolu");
        assertEquals("Tolu", customer.getLastName());
    }
    @Test
    public void testCustomerEmailAddress(){
        Customer customer = new Customer();
        customer.setEmailAddress("ifeco@gmail.com");
        assertEquals("ifeco@gmail.com", customer.getEmailAddress());
    }
    @Test
    public void testCustomerLoginPassword(){
        Customer customer = new Customer();
        customer.setLoginPassword("#29rte");
        assertEquals("#29rte", customer.getLoginAddress());
    }
    @Test
    public void testCustomerAddress(){
        Customer customer = new Customer();
        customer.setCustomerAddress("321 Herber Macauley way");
        assertEquals("321 Herber Macauley way", customer.getCustomerAddress());
    }
    @Test
    public void testPhoneNumber(){
        Customer customer = new Customer();
        customer.setPhoneNumber("08086344532");
        assertEquals("08086344532", customer.getPhoneNumber());
    }

}
