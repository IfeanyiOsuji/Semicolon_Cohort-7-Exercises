package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceLineTest {
    InvoiceLine invoiceLine = new InvoiceLine();
    @Test
    public void testInstanceVariables(){
        invoiceLine.setOrderItemID("AC123");
        assertEquals("AC123", invoiceLine.getOrderItemID());
        invoiceLine.setProductNumber(65);
        assertEquals(65, invoiceLine.getProductNumber());

        invoiceLine.setProductName("Chichi");
        assertEquals("Chichi", invoiceLine.getProductName());
        invoiceLine.setProductCode("AC1234");
        assertEquals("AC1234", invoiceLine.getProductCode());
        invoiceLine.setProductQuantity(78);
        assertEquals(78, invoiceLine.getProductQuantity());
        invoiceLine.setProductPrice(200.00);
        assertEquals(200.00, invoiceLine.getProductPrice());
        invoiceLine.setDeliveryProductCost(598.0);
        assertEquals(598.0, invoiceLine.getDeliveryProductCost());
        invoiceLine.setVAT(879.00);
        assertEquals(879.00, invoiceLine.getVAT());
        invoiceLine.setTotalCost(900.00);
        assertEquals(900.00, invoiceLine.getTotalCost());
    }
}
