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
}
