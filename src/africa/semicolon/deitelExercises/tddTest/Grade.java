package africa.semicolon.deitelExercises.tddTest;

import java.util.Scanner;

public class Grade {
    // >=90 = A
        //80 - 89 = B
    //70 - 79 = C
    // 60 - 69 = D
   // < 60 = F
   /*



    */
    Scanner scanner = new Scanner(System.in);
    public void printGrade(){
        /*
        Pseudocode
        1. Ask the user to enter a score which must not be negative
        2a. If the score is at least 90
                - display A.
        2b. If the score is at least 80
                - display B.
        2c.  If the score is at least 70
                - display C.
        2d.  If the score is at least 60
                - display D.
        2f. If the score is less than 60
                - display F.
        3. If the user enters a negative score

         */
        System.out.println("Enter an score");
        int input = scanner.nextInt();
        if(input >= 90)
            System.out.println("A");
        else
        if(input >= 80)
            System.out.println("B");
        else
        if(input >= 70)
            System.out.println("C");
        else
        if(input >= 60)
            System.out.println("D");
        else
        if(input >= 0)
            System.out.println("F");
        else
            System.out.println("Score must not be negative");
    }
    public void printAnotherGrade(){
//        System.out.println("Enter an Integer");
//
//        int input = scanner.nextInt();
//        if(input >= 60)
//            System.out.println("Passed");
//        if(input < 60)
//            System.out.println("Failed");
        /*
 Pseudocode
        1. Ask the user to enter a score which must not be negative
        2a. If the score is at least 90
                - display A.
        2b. If the score is at least 80 but less than 90
                - display B.
        2c.  If the score is at least 70 but less than 80
                - display C.
        2d.  If the score is at least 60 but less  than 70
                - display D.
        2f. If the score is at least 0 but less than 60
                - display F.
        3. If the user enters a negative score

         */
        System.out.println("Enter an score");
        int input = scanner.nextInt();
        if(input >= 90)
            System.out.println("A");
        if(input >= 80 && input <90)
            System.out.println("B");
        if(input >= 70 && input <80)
            System.out.println("C");
        if(input >= 60 && input < 70)
            System.out.println("D");
        if(input >= 0 && input < 60)
            System.out.println("F");
        if(input < 0)
            System.out.println("Score must not be negative");

   }
    public static void main(String[] args) {
       Grade grade = new Grade();
       //grade.printGrade();
        grade.printAnotherGrade();
    }
}
