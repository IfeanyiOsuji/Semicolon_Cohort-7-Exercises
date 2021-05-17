package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    Course course = new Course();

    @Test
    public void testCourseDode(){
        course.setCourseCode("");
        assertEquals("", course.getCourseCode());
    }
    @Test
    public void testCourseTitle(){
        course.setCourseTitle("");
        assertEquals("", course.getCourseTitle());
    }
    @Test
    public void testCourseDescription(){
        course.setCourseDescription("");
        assertEquals("", course.getCourseDescription());
    }
}
