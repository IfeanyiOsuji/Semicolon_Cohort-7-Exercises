package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {
    CourseModule module = new CourseModule();

    @Test
    public void testModuleID(){
        module.setModuleID("");
        assertEquals("", module.getModuleID());
    }
    @Test
    public void testIfUserCanFindCourse(){
        module.findCourse();
    }

}
