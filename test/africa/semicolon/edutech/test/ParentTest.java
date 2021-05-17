package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParentTest {
    Parent parent = new Parent();
    @Test
    public void testName(){
        parent.setName("");
        assertEquals("", parent.getName());
    }
    @Test
    public void testAddress(){
        parent.setAddress("");
        assertEquals("", parent.getAddress());
    }
}
