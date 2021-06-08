package africa.semicolon.deitelExercises.tddTest.chapter_4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int numberOfIntegers = input.nextInt();
        int count = 1;
        System.out.println("Input the "+count +" value");
        int highest = input.nextInt();
        int secondHighest = 0;
        while (count <numberOfIntegers ){
            System.out.println("Enter "+ ++count +" integer");
            int nextInteger = input.nextInt();
            if(highest <= nextInteger) {
                secondHighest = highest;
                highest = nextInteger;
            }
        }
        System.out.println("Highest is "+highest);
        System.out.println("Second highest is "+secondHighest);

    }
}
