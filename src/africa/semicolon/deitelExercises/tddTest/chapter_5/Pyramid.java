package africa.semicolon.deitelExercises.tddTest.chapter_5;

public class Pyramid {
    public static void displayPyramid(int number){
        for(int i=0; i<number; i++){
            for(int s=2*(number-i); s>0; s--)
                System.out.print(" ");
            for(int t=i+1; t>0; t--)
                System.out.print(t+" ");
            for(int j=2;j<=i+1; j++)
                System.out.print(j+" ");
            System.out.println();
            }
    }
    public static void main(String[] args) {
        displayPyramid(7);
    }
}
