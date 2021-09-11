package africa.semicolon.deitelExercises.tddTest.Store_app_test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ItemTest {
    @Test
    void setUp(){
        Item item = new Item(null, 0.0,2);
        assertNotNull(item);
    }
    @Test
    void testThatItemCanSetName(){
        Item item = new Item(null, 0.0, 0);
        item.setName("Laptop");
        assertEquals("Laptop", item.getName());
    }
    @Test
    void testThatItemCanSetQuantity(){
        Item item = new Item(null, 0.0, 0);
        item.setQuantity(2);
        assertEquals(2, item.getQuantity());
    }
    @Test
    void showThatItemCanShowPrice(){
        Item item = new Item(null, 0.0, 0);
        item.setPrice(500.00);
        assertEquals(500.00, item.getPrice());

    }
    @Test
    void testThatItemHasAllInstanceVariablesAtCreation(){
        Item item = new Item("Laptop", 500.00, 2);
        assertNotNull(item);
    }
}
