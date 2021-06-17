package africa.semicolon.deitelExercises.tddTest;

public class ConditionalStatement {

    private int maxNumber;
    public void checkMaxNumber(int firstNumber, int secondNumber) {

        if(firstNumber > secondNumber) {
            maxNumber = firstNumber;
        }
        else {
            maxNumber = secondNumber;
        }

    }

    public int getMaxNumber() {
        return maxNumber;
    }
}
