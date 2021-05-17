package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnerTest {
    Learner learner = new Learner();

    @Test
    public void testFirstName(){
        learner.setFirstName("");
        assertEquals("", learner.getFirstName());
    }
    @Test
    public void testSurname(){
        learner.setSurname("");
        assertEquals("", learner.getSurname());
    }
    @Test
    public void testEmail(){
        learner.setEmail("");
        assertEquals("", learner.getEmail());
    }
    public void testNewOperation(){
        learner.newOperation();
    }
}
