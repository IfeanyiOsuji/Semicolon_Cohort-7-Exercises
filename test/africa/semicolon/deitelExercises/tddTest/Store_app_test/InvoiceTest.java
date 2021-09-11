package africa.semicolon.deitelExercises.tddTest.Store_app_test;

import org.junit.jupiter.api.Test;

import javax.management.InstanceAlreadyExistsException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InvoiceTest {
    @Test
    void setUp(){
        ItemInvoice invoice = new ItemInvoice();
        assertNotNull(invoice);
    }
    @Test
    void showThatInCanDisplayPurchase(){
        ItemInvoice invoice = new ItemInvoice();
        ItemCart cat = new ItemCart();
        Item item = new Item("laptop", 500.00, 2);
        try {
            cat.addItem(item);
        }catch (InstanceAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        invoice.displayPurchase(cat);
    }
}
