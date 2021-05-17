package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuardianTest {
    Guardian guardian = new Guardian();
    @Test
    public void testGuardianID(){
        guardian.setGuardianID("");
        assertEquals("", guardian.getGuardianID());
    }
}
