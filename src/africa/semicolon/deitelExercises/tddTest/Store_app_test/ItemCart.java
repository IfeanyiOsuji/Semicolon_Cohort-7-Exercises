package africa.semicolon.deitelExercises.tddTest.Store_app_test;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class ItemCart {

    List<Item>items = new ArrayList<>();
    public void addItem(Item item) throws InstanceAlreadyExistsException {
        for (Item newItem:items) {
           if(newItem == item){
               throw new InstanceAlreadyExistsException("Item already exist");
           }
        }
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
