package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderItemsTest {

    OrderItems orderItems = new OrderItems();

    @Test
    public void testOrderItemID() {
        orderItems.setorderItemID("");
        assertEquals("", orderItems.getOrderITemID());
    }
    @Test
    public void testProductCode(){
        orderItems.setProductCode("");
        assertEquals("", orderItems.getProductCode());
    }
    @Test
    public void testOrderCode(){
        orderItems.setOrderCode("");
        assertEquals("", orderItems.getOrderCode());
    }
    @Test
    public void testProductQuantity(){
        orderItems.setProductQuantity(90);
        assertEquals(90, orderItems.getProductQuantity());
    }
    @Test
    public void testUnitSalesPrice(){
        orderItems.setUnitSalesPrice(457.00);
        assertEquals(457.00, orderItems.getUnitSalesPrice());
    }

}
