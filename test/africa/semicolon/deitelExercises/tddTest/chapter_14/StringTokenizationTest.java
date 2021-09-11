package africa.semicolon.deitelExercises.tddTest.chapter_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringTokenizationTest {
    @Test
    void setUp(){
        StringTokenization tokenization = new StringTokenization();
        assertNotNull(tokenization);
    }
}
