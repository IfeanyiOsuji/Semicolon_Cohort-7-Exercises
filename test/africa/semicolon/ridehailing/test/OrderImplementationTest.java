package africa.semicolon.ridehailing.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderImplementationTest {
    OrderImplementation orderImplementation = new OrderImplementation();

    @Test
    public void testOrderID(){
        orderImplementation.setOrderID("");
        assertEquals("", orderImplementation.getOrderID());
    }
    @Test
    public void testCarID(){
        orderImplementation.setCarID("");
        assertEquals("", orderImplementation.getCarID());

    }
}
