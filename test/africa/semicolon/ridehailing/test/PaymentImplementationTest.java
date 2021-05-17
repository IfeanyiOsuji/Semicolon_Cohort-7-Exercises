package africa.semicolon.ridehailing.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentImplementationTest {
    PaymentImplementation paymentImplementation = new PaymentImplementation();

    @Test
    public void testPaymentAmount(){
        paymentImplementation.setAmount(7000.00);
        assertEquals(7000.00, paymentImplementation.getAmount());
    }
    @Test
    public void testThatUserCanMakePayment(){
        paymentImplementation.makePayment(890.00);
    }
}
