package africa.semicolon.ecommemrce_system.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayMentMethodTest {
    PaymentMethod paymentMethod = new PaymentMethod();
    @Test
    public void testInstanceVariables(){
        paymentMethod.setPaymentMethodDate("7/3/2012");
        assertEquals("7/3/2012", paymentMethod.getPaymentMethodDate());
        paymentMethod.setPaymentMethodDescription("");
        assertEquals("", paymentMethod.getPaymentMethodDescription());
    }
}
