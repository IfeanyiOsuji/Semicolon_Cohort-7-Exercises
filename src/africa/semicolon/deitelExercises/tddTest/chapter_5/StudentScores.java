package africa.semicolon.deitelExercises.tddTest.chapter_5;

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
       // int highest =0;
        String nameOfHighest = "";

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int numberOfStudents = input.nextInt();
        int studentNumber = 1;
        System.out.println("Enter "+studentNumber+" score");
        int score = input.nextInt();
        int highest = score;
        System.out.println("Enter "+studentNumber +" name");
        String studentName = input2.nextLine();
        String highestName = studentName;
        while (studentNumber < numberOfStudents){
            studentNumber++;
            System.out.println("Enter "+studentNumber+" score");
            score = input.nextInt();
            System.out.println("Enter "+studentNumber +" name");
            studentName = input2.nextLine();
            if(highest <= score){
                highest = score;
                highestName = studentName;
            }
        }
        System.out.println("Student with the highest score is "+highestName+" with a score of "+highest);

    }
}
