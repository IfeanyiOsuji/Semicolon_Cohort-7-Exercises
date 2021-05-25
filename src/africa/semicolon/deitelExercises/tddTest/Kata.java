package africa.semicolon.deitelExercises.tddTest;

import java.util.Scanner;

public class Kata {
    public static void pallindrum() {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int pal = number + 0;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(pal);
        if (reverse == pal)
            System.out.println("Number is Pallindrum");
    }
    public static void calculateSumAndAverageOfStudentScores(){
        //Pseudocode
        //1.Ask the user to enter the number of Students in the class
        //2. You will need to add the scores of th students, since we dont have the scores yet, the sum is zero
        //3. Input the first student score
        //4. add the score the to the sum;
        //5.  number of scores input which was initially zero is incremented by one.
        //6. while the number of scores is less than number of students
                // repeat repeat 3, 4, 5
        //7. Since we now have the sum of the score as the final value of sum,
            // calculate the average by dividing sum of the scores by the number of scores.

                // Solution
        int sum = 0;
        System.out.println("How many Students are in your class? ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        System.out.println("Input the first score ");
        int score = input.nextInt();
        int numberOfScores = 1;
        sum += score;
        while (numberOfScores < numberOfStudents){
            System.out.println("Input the "+ (numberOfScores+ 1) +" score");
            score = input.nextInt();
            sum+=score;
            numberOfScores++;
        }
        System.out.println("Sum of the scores = "+sum);
        System.out.println("Average of the scores = "+ (sum * 1.0)/numberOfScores);
    }
    public static void calculateAnotherSumAndAverageScores(){
        int sum = 0;
        int numberOfScores = 0;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a score or enter -1 to exit");
            int score = input.nextInt();
            if(score == -1)
                break;
            sum += score;
            numberOfScores++;
        }
        System.out.println("Sum of the scores = "+sum);
        System.out.println("Average of the scores = "+sum * 1.0/numberOfScores);

    }


    public static void main(String[] args) {
//        System.out.println(checkIfANumberIsPrime(3));
        //pallindrum();
        //System.out.println(isPrime(4));
        //calculateSumAndAverageOfStudentScores();
        calculateAnotherSumAndAverageScores();
    }

    public int determinePriceByQuantity(int quantity) {
        //double price = 0;
        if(quantity >= 200)
            return 800 * quantity;
            else
            if(quantity >= 100)
               return 900 * quantity;
            else
            if(quantity >= 50)
                return 1000 * quantity;
            else
             if(quantity >= 30)
                 return 1100 * quantity;
            else
              if(quantity >= 10)
                 return 1200 * quantity;
            else
              if(quantity >= 5)
                  return 1400 * quantity;
            else
              if(quantity >= 1)
                  return 1500 * quantity;
            else
                return 0;

          // return 0;
    }

    public int getNumberOfFactorsOfNumber(int number) {
        int factor = 2;
        int count = 0;
      //  boolean isfactorAtLeastHalfOfNumber = factor <= number/2;
        while(factor <= number/2){
            if((number % factor) == 0)
                count++;
                factor++;
        }
        System.out.println(count +2);
        return count + 2;
    }

    public  int getSellersProfit(int numberOfCopies) {
        int sellersPrice = numberOfCopies * 2000;
        return sellersPrice - determinePriceByQuantity(numberOfCopies);
    }
    public  static boolean checkIfANumberIsPrime(int number){
        if(number == 1)
            return true;
        if(number == 2)
            return true;
        if(number % 2 == 0)
            return false;
        for(int i =3; i<=Math.sqrt(number); i+=2) {
            if (number % i == 0)
                return false;
        }
        return true;

     }

     public static boolean isPrime(int number){
        for (int i = 2; i < Math.sqrt(number) + 1; i++){
            if(number%i == 0) return false;
        }
        return true;
     }
}
