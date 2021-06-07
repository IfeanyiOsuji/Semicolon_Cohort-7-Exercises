package africa.semicolon.deitelExercises.tddTest.chapter_4;

import java.util.Scanner;

public class HighestValue {

    public static int getHighestValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int numberOfIntegers = input.nextInt();
        int count = 1;
        System.out.println("Input the "+count +" value");
        int highest = input.nextInt();
        while (count <numberOfIntegers ){
            System.out.println("Enter "+ ++count +" integer");
            int nextInteger = input.nextInt();
            if(highest < nextInteger)
                highest = nextInteger;
        }

        return highest;
    }

    public static void main(String[] args) {
        System.out.println(getHighestValue());
    }
}
