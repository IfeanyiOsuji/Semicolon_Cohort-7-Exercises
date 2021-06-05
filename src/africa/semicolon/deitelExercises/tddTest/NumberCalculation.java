package africa.semicolon.deitelExercises.tddTest;

public class NumberCalculation {

    private static int firstOperand;
    private static int secondOperad;

    public static void calCulateNumbers(String number){
        separateNumbers(number);
        if(number.contains("+"))
            System.out.println(addNumbers(number));
        if(number.contains("*"))
            System.out.println(multiplyNumbers(number));
        if(number.contains("-"))
            System.out.println(subtractNumbers(number));
        if(number.contains("/"))
            System.out.println(divideNumbers(number));


    }

    private static double divideNumbers(String number) {
        return firstOperand *1.0 / secondOperad;
    }

    private static int subtractNumbers(String number) {
        return firstOperand - secondOperad;
    }

    private static int multiplyNumbers(String number) {
        return firstOperand * secondOperad;
    }

    private static void separateNumbers(String number) {
        String specialCharacters = "[^\\dA-Za-z]";
        String [] parts = number.replace(" ","").split(specialCharacters);
        firstOperand = Integer.parseInt(parts[0]);
        secondOperad = Integer.parseInt(parts[1]);
    }

    private static double addNumbers(String s) {
        return firstOperand * 1.0 + secondOperad;
    }

    public static void main(String[] args) {
        calCulateNumbers("235+7");
        calCulateNumbers("10 * 100");
        calCulateNumbers("900 - 200");
    }
}
