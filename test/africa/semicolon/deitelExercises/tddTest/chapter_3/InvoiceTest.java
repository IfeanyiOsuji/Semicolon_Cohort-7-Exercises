package africa.semicolon.deitelExercises.tddTest.chapter_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    @Test
    public void testThatInvoiceHasBeenCreated(){
        Invoice invoice = new Invoice(2, "A toyota camry", 5, 568.90);
    }
    @Test
    public void testInvoiceAmount(){
        Invoice invoice = new Invoice(2, "A toyota camry", 5, -568.90);
        double invoiceAmount = invoice.getInvoiceAmount();
        assertEquals(0, invoiceAmount);

    }
}
