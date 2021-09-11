package africa.semicolon.deitelExercises.tddTest.Store_app_test;

import java.util.List;
import java.util.Map;

public class ItemInvoice {

    public void displayPurchase(ItemCart cat) {
        ItemCart items = cat;
        System.out.printf("%30s\n\n", "INVOICE");
        System.out.printf("%10s%10s%10s%15s%10s\n","itemNumber","Item","Price","Quantity","total");
        for(int i=0; i<cat.getItems().size(); i++){
            Item item = items.getItems().get(i);
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();

            System.out.printf("%10d%10s%10.2f%14d%14.2f\n", i+1, name, price,quantity, price*quantity);
        }
    }
}
