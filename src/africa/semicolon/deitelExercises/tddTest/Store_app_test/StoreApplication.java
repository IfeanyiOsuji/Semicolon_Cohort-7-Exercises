package africa.semicolon.deitelExercises.tddTest.Store_app_test;

import javax.management.InstanceAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StoreApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Konga Application store");
        Scanner input = new Scanner(System.in);
        String any;
        Item item;
        String name;
        double total =0;
        ItemCart cart = new ItemCart();
        do{
            System.out.println("What did he buy?");
                name = input.nextLine();

                try{
                System.out.println("How much did he pay");
                double price = input.nextDouble();
                System.out.println("How many did he buy?");
                int amount = input.nextInt();
                input.nextLine();
                if(price>=0 && amount>=0) {
                    item = new Item(name, price, amount);
                    cart.addItem(item);
                    total += price * amount;
                }


            }catch (InputMismatchException ex) {
                System.out.println("Please enter a valid input");
            }
            catch (InstanceAlreadyExistsException ex){
                System.out.println(ex.getMessage());
            }
                catch (IllegalArgumentException ex){
                    System.out.println("Invalid value");
                }
            System.out.println("Did he buy anything else?");
            any = input.nextLine();
            //sayMore(any);

        }while(!any.equalsIgnoreCase("No"));

        ItemInvoice invoice = new ItemInvoice();
        invoice.displayPurchase(cart);
        System.out.println("Total price = "+total);
    }

}
