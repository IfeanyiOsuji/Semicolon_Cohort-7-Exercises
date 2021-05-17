package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryItemsTest {
    DeliveryItems deliveryItems = new DeliveryItems();

    @Test
    public void testInsstanceVAriables(){
        deliveryItems.setDeliveryRef("");
        assertEquals("", deliveryItems.getDeliveryRef());
        deliveryItems.setOrderItemID("");
        assertEquals("", deliveryItems.getOrderItemID());

    }
}
