
package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacillitatorTest {
    Facillitator facillitator = new Facillitator();
    @Test
    public void testCourseCode(){
        facillitator.setCourseCode("");
        assertEquals("", facillitator.getCourseCode());
    }
    @Test
    public void testCourseName(){
        facillitator.setName("");
        assertEquals("", facillitator.getName());
    }

}
