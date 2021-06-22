package africa.semicolon.deitelExercises.tddTest;

import java.security.SecureRandom;
import java.util.Arrays;
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
        /*Pseudocode
        //1.Ask the user to enter the number of Students in the class
        //2. You will need to add the scores of th students, since we dont have the scores yet, the sum is zero
        //3. Input the first student score
        //4. add the score the to the sum;
        //5.  number of scores input which was initially zero is incremented by one.
        //6. while the number of scores is less than number of students
                // repeat repeat 3, 4, 5
        //7. Since we now have the sum of the score as the final value of sum,
            // calculate the average by dividing sum of the scores by the number of scores.*/

                // Solution
        /*int sum = 0;
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
        System.out.println("Average of the scores = "+ (sum * 1.0)/numberOfScores);*/
    }
    public static void calculateAnotherSumAndAverageScores(){
      //int sum = 0;
        //int numberOfScores = 0;
        Scanner input = new Scanner(System.in);
    /*    while(true){
            System.out.println("Enter a score or enter -1 to exit");
            int score = input.nextInt();
            if(score == -1)
                break;
            sum += score;
            numberOfScores++;
        }
        System.out.println("Sum of the scores = "+sum);
        System.out.println("Average of the scores = "+sum * 1.0/numberOfScores);*/

        // Another Perspective
        int sum =0;
        System.out.println("Enter a score and enter -1 to quit");
        int numberOfInputs = 0;
        int score = input.nextInt();
        StringBuilder sumOfScores = new StringBuilder();
        while (score != -1){
            sum += score;
            numberOfInputs++;
            sumOfScores.append(" + ").append(score);
            System.out.println("Enter a score and enter -1 to quit");
            score = input.nextInt();
        }
        sumOfScores = new StringBuilder(sumOfScores.substring(2));
        System.out.println("Sum of the scores = "+sumOfScores + " = "+sum);
        System.out.println("Average of the sxores = "+sum * 1.0 / numberOfInputs);


    }
    public static void collectUserInput(){
        Scanner input = new Scanner(System.in);
        int userInput;
        do{
            String transactionPrompt = """
                    -> Enter 1 for  deposit;
                    -> Enter 2 for withdraw;
                    -> Enter 3 to view all Accounts;
                    -> Enter 4 to trasfer;
                    -> Enter 5 to view your details;
                    -> Enter 6 to exit;
                    -> Enter 7 to Logout;
                    """;
            System.out.println(transactionPrompt);
           userInput = input.nextInt();
           if(userInput == 1)
               System.out.println("deposit");
           if(userInput == 2)
               System.out.println("withdraw");
           if(userInput == 3)
               System.out.println("View All Account");
           if(userInput == 4)
               System.out.println("Transfer");
           if(userInput == 5)
               System.out.println("View Details");
           if (userInput == 7)
               System.out.println("LogOut");
           if(userInput > 7)
               System.out.println("Invalid input");
        }
        while(userInput != 6);
    }

    public static int findMaxElementInArray(int[] array) {
        int max = array[0];
        for(int element : array){
            if(max <= element)
                max = element;
        }
        return max;
    }

    public static int findMinElementInArray(int[] elements) {
        int min = elements[0];
        for(int element : elements){
            if(min >= element)
                min = element;
        }
        return min;
    }

    public static double findAverageOfElementsInArray(int[] elements) {
        int sum = 0;
        for(int element : elements)
            sum+=element;
        double average = sum*1.0/elements.length;
        return average;
    }

    public static int findSumOfElements(int[] arrs) {
        int sum = 0;
        for(int i=0; i<arrs.length; i++) {
            sum += arrs[i];
        }
        return sum;
    }

    public static int findMaximumOfSumAfterRemovingEachElement(int[] arr) {
        int sum = findSumOfElements(arr) - arr[0];
        for(int i=0; i<arr.length; i++){
            if(sum < findSumOfElements(arr) - arr[i])
                sum = findSumOfElements(arr) - arr[i];
        }
        return sum;
    }

    public static int findMinimumOfSumAfterRemovingEachElement(int[] arr) {
        int sum = findSumOfElements(arr);
        for(int i=0; i<arr.length; i++){
            if(sum >= findSumOfElements(arr) -arr[i])
                sum = findSumOfElements(arr) - arr[i];
        }
        return sum;
    }

    public String reverseNumber(int digits){
        String getString = Integer.toString(digits);
        String reversed ="";
        for(int i=getString.length()-1; i>=0; i--){
            reversed+=getString.charAt(i);
        }
        System.out.println(reversed);
        return reversed;

    }
    public String reverseOrder(int fiveDigits){
        String reversed = "";
        for (int i=10000; i>0;){
            int getFirstDigit = fiveDigits/i;
            reversed = getFirstDigit+reversed;
            fiveDigits =fiveDigits % i;
            i = i/10;
        }
        System.out.println(reversed);
      return reversed;
    }
    public int findFactorialOf(int number){
        for(int i = number-1; i>0; i--)
            number *=i;
        return number;
    }
    public static int findAnotherfactorial(int number){
        int factroal = number;
        for(int i=1; i<factroal; i++)
            number *= i;
        return number;
    }
public static String returnBinary(int decimal, int base){
        String binary = "";
        while(decimal >0 ){
            int resultOfDivide = decimal % base;
            binary=resultOfDivide+" "+binary;
            decimal /=base;
        }
        return binary;
}
public static int convertHexadecimalToDecimal(String hexValue){
        int decimalValue = 0;
        String hexUpper = hexValue.toUpperCase();
        for(int i=0; i<hexValue.length(); i++){
            char hexChar = hexUpper.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
}

    private static int hexCharToDecimal(char hexChar) {
        if(hexChar >= 'A' && hexChar <= 'F')
            return  10 + hexChar-'A';
        else
            return hexChar - '0';
    }


    public static void main(String[] args) {
        System.out.println((int)'<');
        System.out.println((char)62);

       int [] sideFrequency = frequencyOfDieSides();
       int count = 0;
        System.out.println("face            Frequency");
        for(int i=0; i<6; i++){
            System.out.printf("%d%25d%n", i+1, sideFrequency[i]);
            count+=sideFrequency[i];
        }
        System.out.println(count);

    }
    public static int [] frequencyOfDieSides(){
        SecureRandom random = new SecureRandom();
        int [] dieSides = new int[6];
        for (int i=0; i<6000000; i++){
            dieSides[random.nextInt(6)]++;
        }
        System.out.println(Arrays.toString(dieSides));
        return dieSides;
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
    }

    public int getNumberOfFactorsOfNumber(int number) {
        int factor = 2;
        int count = 0;
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
