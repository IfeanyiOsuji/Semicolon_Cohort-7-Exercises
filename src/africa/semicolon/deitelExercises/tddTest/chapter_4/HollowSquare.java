package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class HollowSquare {
    public static void displaySquare(int number){
      for(int i =1; i<=number; i++){
              System.out.print("*");
          for(int j=1; j<number-1; j++){
              if(i==1)
                  System.out.print(" *");
              if(i==number)
                  System.out.print(" *");
              if(i>1 && i< number)
              System.out.print("  ");
          }
          System.out.println(" *");
      }

    }

    public static void main(String[] args) {
        displaySquare(5);
    }
}
