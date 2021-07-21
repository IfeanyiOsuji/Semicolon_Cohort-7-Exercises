package africa.semicolon.deitelExercises.tddTest;



public class Calculator {

    public int add(int firstNumber, int secondnumber) {
        return firstNumber + secondnumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if(secondNumber > firstNumber){
            swap(firstNumber, secondNumber);
        }
        System.out.println(firstNumber + " "+secondNumber);
        return firstNumber - secondNumber;
    }

    private void swap(int firstNumber, int secondNumber) {
        int temp = secondNumber;
        secondNumber = firstNumber;
        firstNumber = temp;
       // System.out.println(firstNumber + " "+secondNumber);
    }

    public double divide(int firstNumber, int secondNumber) {
        if(secondNumber ==0)
            return 0;
        else
        return  (double) firstNumber/secondNumber;
    }
    public static int findGreatestCommonDivisor(int number1, int number2) {
        int divisor = 2;
        int factor = 1;
        while (number2 > number2/2) {
            if (number1 % divisor == 0 && number2 % divisor == 0) {
                factor *= divisor;
                number1 /= divisor;
                number2 /= divisor;

            }
            divisor++;

        }
        return factor;
    }

    public static void main(String[] args) {
        System.out.println(findGreatestCommonDivisor(1680, 640));
    }
}
