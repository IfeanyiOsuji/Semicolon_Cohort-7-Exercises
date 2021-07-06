package africa.semicolon.deitelExercises.tddTest;

public class SequenceAndSeries {

    public static int getNextArithmeticTerm(int firstTerm, int secondTerm, int commonDifference, int numberOfTerms) {
        int nextTerm = firstTerm + (numberOfTerms-1) * commonDifference;
        return nextTerm;
    }

    public static int getNextGeometricTerms(int firstterm, int secondterm, int thirdTerm, int commonRatio, int numberOfTerms) {
        int nextTerm = (int)(firstterm * Math.pow(commonRatio, numberOfTerms-1));
        return nextTerm;
    }
}
