package africa.semicolon.deitelExercises.tddTest.chapter_4;

import java.util.Scanner;

public class GasMileage {
    public double calculateGasPerGallon(int milesDriven, int gallonUsed) {
        return milesDriven * 1.0 / gallonUsed;
    }
    public static void calculateGasPerGallon() {
        Scanner input = new Scanner(System.in);
        int milesDriven = 0;
        int gallonsUsed = 0;
        while (true){
            System.out.println("Enter value for miles driven ");
            int miles = input.nextInt();
            if(miles <=0)
                break;
            System.out.println("Enter the number of gallons used ");
            int gallons = input.nextInt();
            if(gallons <=0)
                break;
                System.out.println("Average miles per gallon for this trip = " + miles * 1.0 / gallons);
                milesDriven += miles;
                gallonsUsed += gallons;
        }
        System.out.println("Total miles driven = "+milesDriven);
        System.out.println("Total gallons used = "+gallonsUsed);
        System.out.println("Total miles per gallon used = "+milesDriven *1.0/gallonsUsed);
    }

    public static void main(String[] args) {
        calculateGasPerGallon();
    }
}
