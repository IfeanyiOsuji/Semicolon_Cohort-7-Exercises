package africa.semicolon.deitelExercises.tddTest.chapter_4;

import java.util.Scanner;

public class GasMileage {
    /*
        PseudoCode
        1. Ask the user to write out the number of trips recorded
            1.1 the initial miles per gallon travelled for each trip is zero
        2. while the user input is not up to the number of trips
        3. Ask the user to input the number of miles driven per trip which must be greater than zero;
        4. Ask the user to input the number of gallons used per trip which must be greater than zero;
        5. Display the miles per gallon obtained for each trip
           5.1 get the sum of the miles per gallon obtained for each trip.
        6. while there is still values to input,
            repeat 3, 4, 5.
     */
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
