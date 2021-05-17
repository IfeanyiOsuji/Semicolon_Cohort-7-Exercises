package africa.semicolon.edutech.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseLanguageTest {
    CourseLanguage courseLanguage = new CourseLanguage();
    @Test
    public void testLanguageCode(){
        courseLanguage.setLanguageCode("");
        assertEquals("", courseLanguage.getLanguageCode());
    }
    @Test
    public void testLanguageName(){
        courseLanguage.setLanguageName("");
        assertEquals("", courseLanguage.getLanguageName());
    }
}
