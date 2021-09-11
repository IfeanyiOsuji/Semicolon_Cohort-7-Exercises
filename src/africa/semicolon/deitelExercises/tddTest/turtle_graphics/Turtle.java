package africa.semicolon.deitelExercises.tddTest.turtle_graphics;
import static africa.semicolon.deitelExercises.tddTest.turtle_graphics.Direction.*;
import static africa.semicolon.deitelExercises.tddTest.turtle_graphics.PenPosition.*;

public class Turtle {
    Pen pen;
    private Direction currentDirection;
    private TurtlePosition position;
    public Turtle(){
        pen = new Pen();
        currentDirection = EAST;
        position = new TurtlePosition();
    }

    public Pen getPen() {
        return pen;
    }

    public void penDowm() {
        pen.setPosition(DOWN);
    }

    public Object getPenPosition() {
        return pen.getPosition();
    }

    public void penUp() {
        pen.setPosition(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection){
            case EAST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = WEST;
            case WEST -> currentDirection = NORTH;
            case NORTH -> currentDirection = EAST;
        }
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> currentDirection = NORTH;
            case NORTH -> currentDirection = WEST;
            case WEST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
        }
    }

    public int getHorizontalPosition() {
        return position.getHorizontalPosition();
    }

    public int getVerticalPosition() {
        return position.getVerticalPosition();
    }

    public void moveForward(int distance) {
        int horizontalPosition = position.getHorizontalPosition();
        int verticalPosition = position.getVerticalPosition();
        if(currentDirection == EAST){
            horizontalPosition += distance;
            position.setHorizontalPosition(horizontalPosition);
        }
        else if(currentDirection == SOUTH){
            verticalPosition += distance;
            position.setVerticalPosition(verticalPosition);
        }
        else if(currentDirection == WEST){
            horizontalPosition -= distance;
            position.setHorizontalPosition(horizontalPosition);
        }
        else if(currentDirection == NORTH){
            verticalPosition -= distance;
            position.setVerticalPosition(verticalPosition);
        }



    }

    public char write() {
        char mark = ' ';
        if(pen.penPosition == DOWN)
        mark = '*';
        return mark;
    }
}
