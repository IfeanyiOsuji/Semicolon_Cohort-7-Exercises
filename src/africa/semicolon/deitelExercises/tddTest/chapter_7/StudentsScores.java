package africa.semicolon.deitelExercises.tddTest.chapter_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentsScores {
    private static int numberOfStudent =2;
    public static int subjectNumber = 2;
    private static Scanner input = new Scanner(System.in);
    static int [][] scores = new int[numberOfStudent][subjectNumber];
    public void displayHeader(){
       // for()
    }

    public static void main(String[] args) {
        int studentName = 5;
        int studentScores = 5;
        Scanner input = new Scanner(System.in);
        int [][] scores = new int[studentName][studentScores];
        System.out.print("Student     ");

        for(int subject =0; subject<studentName; subject++) {
            String subj = "Subject"+ (subject + 1) +"     ";

            for(int score = 0; score<1; score++) {
                System.out.print(subj);
            }

        }
        System.out.println();
        //displayScore();
        collectScore();
    }
    private static void displayScore(){
        for(int student =0; student<2; student++){
            String  studentNumber = "Student"+(student+1);
            System.out.println(studentNumber);
            for(int subjectScore =0; subjectScore<5; subjectScore++){
                //System.out.println("Enter student "+student+" score ");

               // scores[student][subjectScore] = score;
                System.out.print(scores[student][subjectScore] +"     ");
            }
           // System.out.println();

        }
    }
    private static void collectScore(){
        for(int i=0; i<numberOfStudent; i++ ) {
            for(int j=0; j<subjectNumber; j++){
                int num = j+1;
                System.out.println("Collect score for subject "+num);
                scores[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.toString(scores));
    }
}
