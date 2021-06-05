package africa.semicolon.deitelExercises.tddTest.chapter_4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    private double itemValue;
    private double totalSale;
    private Scanner itemSold;
   // private int item;

    public double getValueOfItemSold(int itemNumber) {
        switch (itemNumber){
            case 1 -> itemValue = 239.99;
            case 2 -> itemValue = 129.75;
            case 3 -> itemValue = 99.95;
            case 4 -> itemValue = 350.89;
            default -> itemValue = 0.0;
        }
        return itemValue;
    }

    public void makeSale(int itemNumber) {
        getValueOfItemSold(itemNumber);
        totalSale += itemValue;
    }

    public double getTotalSalesForTheWeek() {
        return totalSale;
    }

    public double getCommissionForTheWeek() {
        return 200 + (9*totalSale)/100;
    }
    public double getTotalCommissionForTheWeek(){
            getItem();
          return   getCommissionForTheWeek();
    }

    private void getItem() {
        itemSold = new Scanner(System.in);
        int item;
        do {
            System.out.println("Enter item sold");
            item = itemSold.nextInt();
            makeSale(item);
        }
        while (item >1 && item<=4);

    }

    public static void main(String[] args) {
        SalesCommissionCalculator kenneth = new SalesCommissionCalculator();
        kenneth.getItem();
        System.out.println(kenneth.getTotalSalesForTheWeek());
        System.out.println(kenneth.getTotalCommissionForTheWeek());
    }
}
