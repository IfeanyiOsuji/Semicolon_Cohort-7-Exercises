package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 private String deliveryRef;
    private String orderID;
    private int trackingNumber;
    private String dateShipped;
    private String dateDelivered;
    private String deliveryDetails;
 */
public class DeliveryTest {
    Delivery delivery = new Delivery();
    @Test
    public void testInstanceVariables(){
        delivery.setDeliveryRef("");
        assertEquals("", delivery.getDeliveryRef());
        delivery.setOrderID("");
        assertEquals("", delivery.getOrderID());
        delivery.setTrackingNumber(78);
        assertEquals(78,delivery.getTrackingNumber());
        delivery.setDateShipped("");
        assertEquals("", delivery.getDateShipped());
        delivery.setDateDelivered("");
        assertEquals("", delivery.getDateDelivered());
        delivery.setDeliveryDetails("");
        assertEquals("",delivery.getDeliveryDetails());

    }
}
