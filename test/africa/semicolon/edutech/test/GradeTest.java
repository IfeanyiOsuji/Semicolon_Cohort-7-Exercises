package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {
    Grade grade = new Grade();
    @Test
    public void testgradeID(){
        grade.setGradeID("");
        assertEquals("", grade.getGradeID());
    }
    public void testCourseCode(){
        grade.setCourseCode("");
        assertEquals("", grade.getCourseCode());
    }
}
