package africa.semicolon.deitelExercises.tddTest.Store_app_test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class cartTest {
    @Test
    void setUp(){
        ItemCart cat = new ItemCart();
        assertNotNull(cat);
    }
    @Test
    void testThatItemHasAListOfCart(){

    }
}
