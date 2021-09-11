package africa.semicolon.deitelExercises.tddTest.chapter_7;

public class DisplayingTwoDimensionalArrays {
    public static void main(String[] args) {
        int numbers [][] = {{2,3,5}, {0,5,9},{1,2,9}};
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }

}
