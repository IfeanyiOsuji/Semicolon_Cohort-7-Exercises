package africa.semicolon.deitelExercises.tddTest.chapter_4;

import java.util.Scanner;

public class HighestAndLowest {

    public  void evaluateHighestAndLowest(){
       Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number ");
        int firstNumber = userInput.nextInt();
        int count = 1;
        int highest =firstNumber;
        int lowest = firstNumber;
        for(int i = 1; i< 10; i++){
            System.out.println(count);
            System.out.println("Enter another number ");
            int secondNumber = userInput.nextInt();
            if(lowest > secondNumber){
                lowest =secondNumber;
            }
           if(highest < secondNumber)  {
                highest = secondNumber;
            }
           count++;
        }
        System.out.println(lowest);
        System.out.println(highest);


    }
    private void largestAndSecondLargest(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number ");
        int firstNumber = userInput.nextInt();
        int count = 1;
        int temp= firstNumber+0;
        int temp2 = 0;
        int highest =firstNumber;
        int secondHighest = firstNumber;

        for(int i = 1; i< 10; i++){
            System.out.println(count);
            System.out.println("Enter another number ");
            count++;
            int secondNumber = userInput.nextInt();
            temp2 = secondNumber + 0;
            if(highest < secondNumber) {
                highest = secondNumber;
            }
            if(i>=3) {
                if (secondHighest < secondNumber) {
                    secondHighest = secondNumber;
                }
            }

        }
        System.out.println(highest);
        System.out.println(secondHighest);

    }

   /* private void determineHighestAndLowest(int getNumbers) {
        if(firstNumber <getNumbers) {
            lowest = firstNumber;
            firstNumber = getNumbers;
        }
        else
            if(firstNumber < getNumbers) {
                highest = getNumbers;
                firstNumber = getNumbers;
            }
        System.out.println("nter a number ");
    }

    */

    public static void main(String[] args) {
        HighestAndLowest highestAndLowest = new HighestAndLowest();
        highestAndLowest.evaluateHighestAndLowest();

    }
}
