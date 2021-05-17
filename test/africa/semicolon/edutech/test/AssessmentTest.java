package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssessmentTest {
    Assessment assessment = new Assessment();
    @Test
    public void testAssessmentID(){
        assessment.setAssessmentID("");
        assertEquals("", assessment.getAssessmentID());
    }
    @Test
    public void testCourseID(){
        assessment.setCourseCode("");
        assertEquals("", assessment.getCourseCode());
    }
}
