package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerAddressTest {
    CustomerAddress customerAddress = new CustomerAddress();
    @Test
    public void testInstanceVariables(){
        customerAddress.setCustomerAddressID("");
        assertEquals("", customerAddress.getCustomerAddressID());
        customerAddress.setCustomerID("");
        assertEquals("", customerAddress.getCustomerID());
        customerAddress.setAddressLine1("");
        assertEquals("", customerAddress.getAddressLine1());
        customerAddress.setTownCity("");
        assertEquals("", customerAddress.getTownCity());
        customerAddress.setPostalCode("");
        assertEquals("", customerAddress.getPostalCode());
        customerAddress.setState("");
        assertEquals("", customerAddress.getState());
        customerAddress.setCountry("");
        assertEquals("", customerAddress.getCountry());

    }
}
