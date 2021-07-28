package africa.semicolon.deitelExercises.tddTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SalesStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        List<Double>prices = new ArrayList<>();
        List<Integer>quantity = new ArrayList<>();
        double total =0;
        String any;
        do{
            System.out.println("What did he buy?");
            try {
                String item = scanner.nextLine();
                items.add(item);
                System.out.println("How much did he pay");
                double price = scanner.nextDouble();
                System.out.println("How many did he buy?");
                int amount = scanner.nextInt();
                total += price*amount;
                quantity.add(amount);
                prices.add(price);
                scanner.nextLine();

            }catch (InputMismatchException ex) {
                System.out.println("Please enter a valid input");
            }
            System.out.println("Did he buy anything else?");
            any = scanner.nextLine();
        }while(!any.equalsIgnoreCase("No"));

        System.out.printf("%10s\n", "INVOICE");
        System.out.printf("%10s%10s%10s%10s%10s\n","itemNumber","Item","Price","Quantity","total");
        for(int i=0; i<items.size(); i++){
            printInvoice(i+1,items.get(i), prices.get(i), quantity.get(i), prices.get(i)*quantity.get(i));
        }
        System.out.println("Total price = " + total);
    }

    public static void printInvoice(int itemNumber, String item, double price, int amount, double totalprice ){
        System.out.printf("%10d%10s%10.2f%10d%15.2f\n", itemNumber, item, price,amount, totalprice);
    }
}
