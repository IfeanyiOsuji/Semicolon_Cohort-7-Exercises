package africa.semicolon.deitelExercises.tddTest.turtle_graphics;

import java.util.Arrays;
import java.util.Scanner;

public class TurTleGraphicsApplication {
        public static Turtle turtle = new Turtle();
        public static int horizontalPosition = 0;
        public static int verticalPosition = 0;
    public static char [][] sketchPad = new char[20][20];
    public static void main(String[] args) {


        //System.out.println(Arrays.deepToString(sketchPad));
        String instructions = """
                1 -> Pen Up
                2 -> Pen Down
                3 -> Turn right
                4 -> Turn left
                5 -> Move forward
                6 -> Display the 20-by-20 array
                9 -> End of data
                """;
        System.out.println(instructions);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a command");
        int command;

        do{
            System.out.println(instructions);
            command = input.nextInt();
            switch (command){

                case 1: turtle.penUp();
                        break;
                case 2:turtle.penDowm();
                        break;
                case 3:turtle.turnRight();
                        break;
                case 4:turtle.turnLeft();
                        break;
                case 5:
                    System.out.println("Enter number Of steps forward");
                    int steps = input.nextInt();
                    horizontalPosition = turtle.getHorizontalPosition();
                    if(turtle.getCurrentDirection()==Direction.EAST) {
                    for(int i = horizontalPosition; i<steps+horizontalPosition; i++){
                             turtle.moveForward(i);
                              sketchPad[verticalPosition][i] = turtle.write();
                          }
                        displaySketchpad();
                }else
                    if(turtle.getCurrentDirection()==Direction.WEST){
                        int currentPosition = sketchPad.length - steps;
                        verticalPosition = turtle.getVerticalPosition();
                        for(horizontalPosition=turtle.getHorizontalPosition(); horizontalPosition>currentPosition;turtle.moveForward(horizontalPosition)){
                            //turtle.moveForward(horizontalPosition);
                            sketchPad[verticalPosition][horizontalPosition] = turtle.write();

                        }
                        displaySketchpad();
                    }
                    else
                    if(turtle.getCurrentDirection()==Direction.SOUTH){
                       verticalPosition = turtle.getVerticalPosition();
                        for(int i=verticalPosition; i<verticalPosition+steps; i++) {
                            turtle.moveForward(i+1);
                            System.out.println(turtle.getHorizontalPosition());
                            sketchPad[i][horizontalPosition] = turtle.write();

                        }
                        displaySketchpad();
                    }else
                        if(turtle.getCurrentDirection()==Direction.NORTH){
                            int currentPosition = sketchPad.length - steps;
                            horizontalPosition = turtle.getHorizontalPosition();
                            for(verticalPosition=turtle.getVerticalPosition(); verticalPosition>currentPosition; verticalPosition-- ) {
                                turtle.moveForward(verticalPosition);

                                sketchPad[verticalPosition][horizontalPosition] = turtle.write();

                            }
                            displaySketchpad();
                        }


                    break;

            }
        }while (command != 9);
    }

    private static void displaySketchpad() {
        for(int i=0; i<sketchPad.length; i++){
            for (int j=0; j<sketchPad.length; j++) {
                System.out.print(sketchPad[i][j]);
            }
            System.out.println();
        }
    }
}
