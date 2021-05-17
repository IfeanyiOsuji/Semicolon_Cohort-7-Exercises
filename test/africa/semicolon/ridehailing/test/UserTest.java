package africa.semicolon.ridehailing.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    User user = new User();

    @Test
    public void testUserName(){
        user.setName("");
        assertEquals("", user.getName());
    }
    @Test
    public void testUserPhone(){
        user.setPhone("");
        assertEquals("", user.getPhone());
    }
    @Test
    public void testIfUserCanRequestRide(){
        user.requestRide();
    }
    @Test
    public void testThatUserCanMakePayment(){
        user.makePayment();
    }
    @Test
    public void testThatUserCanRequestPayment(){
        user.requestPayment();
    }
    @Test
    public void testThatUserCanConfirmPayment(){
        user.confirmPayment();
    }
}
