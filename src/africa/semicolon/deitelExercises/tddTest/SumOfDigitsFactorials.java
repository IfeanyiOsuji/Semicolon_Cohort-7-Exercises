package africa.semicolon.deitelExercises.tddTest;

public class SumOfDigitsFactorials {
    public static int printSumOfDigitsFactorial(int number){
        int sumOfDigits = 0;
        while(number >0){
            int digit = number%10;
            for(int j=digit-1; j>0; j--){
                digit *=j;
            }
            System.out.println(digit);
            sumOfDigits+=digit;
            number /= 10;
        }
        return sumOfDigits;
    }
    public static int sumOfFactorialOfDigits(int sumOfDigits){
        int sum = 0;
        while (sumOfDigits >0){
            int digit = sumOfDigits % 10;
            sum+=digit;
            sumOfDigits /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(printSumOfDigitsFactorial(267));
        int sum = printSumOfDigitsFactorial(267);
        System.out.println(sumOfFactorialOfDigits(sum));
        System.out.println((int)((int)'a' + Math.random() * ((int)'z' - (int)'a' + 1)));
        System.out.println((int)'a');
    }

}
