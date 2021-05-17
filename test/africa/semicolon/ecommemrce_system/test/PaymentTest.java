package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
private String paymentRef;
    private int invoiceNumber;
    private String paymentmethodCode;
    private String invoice;
    private String paymentDate;
    private double paymentAmount;
 */
public class PaymentTest {
    Payment payment = new Payment();
    @Test
    public void testInstanceVariables(){
        payment.setPaymentRef("");
        assertEquals("",payment.getPaymentRef());
        payment.setInvoiceNumber(65);
        assertEquals(65, payment.getInvoiceNumber());
        payment.setPaymentMethodCode("");
        assertEquals("", payment.getPaymentMethodCode());
        payment.setInvoice("");
        assertEquals("", payment.getInvoice());
        payment.setPaymentDate("");
        assertEquals("", payment.getPaymentDate());
        payment.setPaymentAmount(100000.00);
        assertEquals(100000.00,payment.getPaymentAmount());

    }
}
