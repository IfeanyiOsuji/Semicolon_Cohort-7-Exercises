package africa.semicolon.deitelExercises.tddTest.chapter_5;

public class DiamondShape {
    public static void printDiamond(int number){
        for(int i=0; i< number; i++){
            for(int j=number-i; j>0; j--)
                System.out.print(" ");
            for(int k=i; k<=i*2; k++)
                System.out.print("*");
            System.out.println();
        }


    }

    public static void main(String[] args) {
        printDiamond(5);
    }
}
