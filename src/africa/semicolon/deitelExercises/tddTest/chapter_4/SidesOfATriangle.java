package africa.semicolon.deitelExercises.tddTest.chapter_4;

import java.util.Scanner;

public class SidesOfATriangle {
    Scanner input = new Scanner(System.in);
    int sideA;
    int sideB;
    int sideC;
    public void determineIfSidesCanMakeATriangle(){
        System.out.println("Enter the first side");
        sideA = input.nextInt();
        System.out.println("Enter the second side ");
        sideB = input.nextInt();
        System.out.println("Enter the third side");
        sideC = input.nextInt();
        if(sideA > 0 && sideB > 0 && sideC >0){
            if(sideA < sideB+sideC && sideB < sideA+sideC && sideC < sideA+sideB)
                System.out.println("The sides can make a triangle");
            else
                System.out.println("The sides dont make a triangle");
        }

    }
    public void determineIfSidesMakeARightAngleTriangle(){
       if(sideC *sideC == (sideA *sideA) + (sideB * sideB)){
           System.out.println("The sides make a right angled triangle");
       }
       else
           System.out.println("The sides dont make a right angled triangle");
    }
    public static void main(String[] args) {
        SidesOfATriangle sidesOfATriangle = new SidesOfATriangle();
        sidesOfATriangle.determineIfSidesCanMakeATriangle();
        sidesOfATriangle.determineIfSidesMakeARightAngleTriangle();

    }
}
