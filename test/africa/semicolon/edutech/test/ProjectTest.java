package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectTest {
    Project project = new Project();
    @Test
    public void testName(){
        project.setName("");
        assertEquals("", project.getName());
    }
    @Test
    public void testCourseCode(){
        project.setCourseCode("");
        assertEquals("", project.getCourseCode());
    }
}
