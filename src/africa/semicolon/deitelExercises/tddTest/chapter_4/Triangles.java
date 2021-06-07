package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class Triangles {
    public void displaytrianglesOneAtATime() throws InterruptedException {
        for(int i=0; i< 10; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
                Thread.sleep(1000);
            }
            System.out.println();
        }

        System.out.println();
        for(int i=10; i>0; i--){
            for (int j=0; j<i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<=10; i++){
            for (int j=0; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=10; k>=i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<=10; i++){
            for (int j=0; j<=10-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void displayTrianglesOnEachSide(){
        for(int i=0; i<10; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print("*");
            }
            for (int k=0;k<10-i; k++)
                System.out.print(" ");
            for (int l=0; l<5; l++)
                System.out.print(" ");
            for(int m=0; m<10-i; m++)
                System.out.print("*");
            for(int n=0; n<=i; n++)
                System.out.print(" ");
            for(int o =0; o<5; o++)
                System.out.print(" ");
            for(int p=0; p<=i; p++)
                System.out.print(" ");
            for (int q=0;q<10-i; q++)
                System.out.print("*");
            for (int r=0; r<5; r++)
                System.out.print(" ");
            for(int s=0; s<10-i; s++)
                System.out.print(" ");
            for(int t=0; t<=i; t++)
                System.out.print("*");


            System.out.println();
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Triangles triangles = new Triangles();
        triangles.displaytrianglesOneAtATime();
    }

}
