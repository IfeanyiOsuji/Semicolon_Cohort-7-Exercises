package africa.semicolon.deitelExercises.tddTest.Store_app_test;


import org.junit.jupiter.api.Test;

import javax.management.InstanceAlreadyExistsException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ItemCartTest {
    @Test
    void setUp(){
        ItemCart cat = new ItemCart();
        assertNotNull(cat);
    }
    @Test
    void testThatCartCanAddItem(){
        ItemCart cat = new ItemCart();
        Item item = new Item("laptop", 500.00, 2);
        try {
            cat.addItem(item);
            assertEquals(item, cat.getItems().get(0));
        }catch (InstanceAlreadyExistsException ex){
            System.out.println(ex.getMessage());
        }

    }
    @Test
    void testThatCatCanOnlyStoreUniqueItems(){
        ItemCart cat = new ItemCart();
        Item item = new Item("laptop", 500.00, 2);
        Item item2 = new Item("laptop", 500.00, 2);
        try {
            cat.addItem(item);
            cat.addItem(item);
            cat.addItem(item2);
            assertEquals(2, cat.getItems().size());
        }catch (InstanceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
    }
}
