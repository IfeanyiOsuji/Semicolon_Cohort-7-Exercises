package africa.semicolon.ecommemrce_system.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    Invoice invoice = new Invoice();
    @Test
    public void testInstancaraibles(){
        invoice.setInvoiceNumber(576);
        assertEquals(576, invoice.getInvoiceNumber());
        invoice.setOrderCode("UI231");
        assertEquals("UI231",invoice.getOrderCode());
        invoice.setOrderDate("5/8/2020");
        assertEquals("5/8/2020", invoice.getOrderDate());
        invoice.setInvoiceDetails("Invoice details here");
        assertEquals("Invoice details here", invoice.getInvoiceDetails());
    }

}
