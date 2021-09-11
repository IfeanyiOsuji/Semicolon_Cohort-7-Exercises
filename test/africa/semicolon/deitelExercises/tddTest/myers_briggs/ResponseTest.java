package africa.semicolon.deitelExercises.tddTest.myers_briggs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponseTest {
    void setUp(){
        Response response = new Response();
    }
    @Test
    void testThaResponseTypeCanBeSet(){
        Response response = new Response();
        response.setType('A');
        assertEquals('A', response.getType());
    }

}
