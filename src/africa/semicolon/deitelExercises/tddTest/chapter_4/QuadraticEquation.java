package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class QuadraticEquation {
    private int quotientC;
    private  int quotientB;
    private  int quotientA;
    private double firstRootOfEquation;
    private double secondRootOfEquation;

    public QuadraticEquation(int quotientA, int quotientB, int quotientC) {
        this.quotientA = quotientA;
        this.quotientB = quotientB;
        this.quotientC = quotientC;
    }
    public boolean isPositiveRoot() {
        if((quotientB * quotientB) -(4 * quotientA * quotientC) >= 0)
                return true;
        return false;
    }

    public int findRoots() {
        int numberOfroots = 0;

        if(isPositiveRoot()){
            solveEquation();
            if(firstRootOfEquation == secondRootOfEquation)
                numberOfroots+=1;
            else
                numberOfroots+=2;
        }
        return numberOfroots;
    }

    private void solveEquation() {
        double squareOfQuotientB = Math.pow(quotientB, 2);
        int quotientAquotientC = 4*quotientA * quotientC;
        firstRootOfEquation = quotientB - Math.sqrt((squareOfQuotientB - quotientAquotientC)/(2 * quotientA));
        secondRootOfEquation = quotientB + Math.sqrt((squareOfQuotientB - quotientAquotientC)/(2 * quotientA));
    }
}
