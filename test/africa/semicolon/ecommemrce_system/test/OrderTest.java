package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
private String orderCode;
    private String customerID;
    private String orderDate;
    private String orderDetails;
    private double totalPrice;
 */
public class OrderTest {
    Order order = new Order();
    @Test
    public void testOrderCode(){
        order.setOrderCode("");
        assertEquals("", order.getOrderCode());
    }
    @Test
    public void testCustomerID(){
        order.setCustomerID("");
        assertEquals("", order.getCustomerID());
    }
    @Test
    public void testOrderDate(){
        order.setOrderDate("");
        assertEquals("", order.getOrderDate());
    }
    @Test
    public void testOrderDetails(){
        order.setOrderDetails("");
        assertEquals("", order.getOrderDetails());
    }
    @Test
    public void testTotalPrice(){
        order.setTotalPrice(9000.00);
        assertEquals(9000.00, order.getTotalPrice());
    }
}
