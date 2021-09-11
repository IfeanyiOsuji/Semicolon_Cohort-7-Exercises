package africa.semicolon.deitelExercises.tddTest.turtle_graphics;

import org.junit.jupiter.api.Test;

import static africa.semicolon.deitelExercises.tddTest.turtle_graphics.Direction.*;
import static africa.semicolon.deitelExercises.tddTest.turtle_graphics.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    void setUp(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test
    void testThatTurtleHasAPen(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle.getPen());
    }
    @Test
    void testThatPenHasPosition(){
        Pen biro = new Pen();
        assertNotNull(biro.getPosition());
    }
    @Test
    void testThatTurtleCanTurnPenDown(){
        Turtle turtle = new Turtle();
        assertSame(UP, turtle.getPenPosition());

        turtle.penDowm();
        assertSame(DOWN, turtle.getPenPosition());
    }
    @Test
    void testThatTurtleCanTurnPenUp(){
        Turtle turtle = new Turtle();
        turtle.penDowm();

        turtle.penUp();
        assertSame(UP, turtle.getPenPosition());
    }
    @Test
    void testThatTurtleIsFacingEastOnDefault(){
        Turtle turtle = new Turtle();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    void testThatWhenTurnedRightFromEastTurtleFacesSouth(){
        Turtle turtle = new Turtle();
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatWhenTurnedRightFromSouthTurtleFacesWest(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        // when
        turtle.turnRight();
        //assert
        assertSame(WEST, turtle.getCurrentDirection());

    }
    @Test
    void testThatWhenTurnedRightFromWestTurtleFacesNorth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        // when
        turtle.turnRight();
        //assert
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void testThatWhenTurnedRightFromNorthTurtleFacesEast(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        // when
        turtle.turnRight();
        //assert
        assertSame(EAST, turtle.getCurrentDirection());
    }
   @Test
    void testThatWhenTurnedLeftFromEastTurtleFacesNorth(){
       Turtle turtle = new Turtle();
       //when
       turtle.turnLeft();
       assertSame(NORTH, turtle.getCurrentDirection());
   }
   @Test
    void testThatWhenTurnedLeftFromNorthTurtleFacesWest(){
       Turtle turtle = new Turtle();
       turtle.turnLeft();
       //when
       turtle.turnLeft();
       assertSame(WEST, turtle.getCurrentDirection());
   }
   @Test
    void testThatWhenTurnedLeftFromWestTurtleFacesSouth(){
       Turtle turtle = new Turtle();
       turtle.turnLeft();
       turtle.turnLeft();
       //when
       turtle.turnLeft();
       assertSame(SOUTH, turtle.getCurrentDirection());
   }
   @Test
    void testThatWhenTurnedLeftFromSouthTurtleFacesEast(){
       Turtle turtle = new Turtle();
       turtle.turnLeft();
       turtle.turnLeft();
       turtle.turnLeft();
       //when
       turtle.turnLeft();
       assertSame(EAST, turtle.getCurrentDirection());
   }
   @Test
    void testThatTurtleHasDefaultPosition0Horizontally(){
        Turtle turtle = new Turtle();
        assertEquals(0, turtle.getHorizontalPosition());
   }
   @Test
    void testThatTurtleHasDefaultPosition0Vertically(){
       Turtle turtle = new Turtle();
       assertEquals(0, turtle.getVerticalPosition());
   }
   @Test
    void testThatTurtleCanMoveForwardWhileFacingEast(){
        Turtle turtle = new Turtle();
        turtle.moveForward(5);
        assertEquals(5, turtle.getHorizontalPosition());
        assertEquals(0, turtle.getVerticalPosition());
   }
   @Test
    void testThatTurtleCanMoveDownWardWhenFacingSouth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.moveForward(5);
        assertEquals(0, turtle.getHorizontalPosition());
        assertEquals(5, turtle.getVerticalPosition());
   }
   @Test
    void testThatTurtleCanMoveBackwardWhenFacingWest(){
       Turtle turtle = new Turtle();
       turtle.turnRight();
       turtle.turnRight();
       turtle.moveForward(5);
       assertEquals(-5, turtle.getHorizontalPosition());
       assertEquals(0, turtle.getVerticalPosition());
   }
   @Test
    void testThatTurtleCanMoveUpwardWhenFacingNorth(){
       Turtle turtle = new Turtle();
       turtle.turnRight();
       turtle.turnRight();
       turtle.turnRight();
       turtle.moveForward(5);
       assertEquals(0, turtle.getHorizontalPosition());
       assertEquals(-5, turtle.getVerticalPosition());
   }
   @Test
    void testThatTurtleCanWriteWhenOnlyWhenPenIsDown(){
       Turtle turtle = new Turtle();
       turtle.penDowm();
       assertEquals('*', turtle.write());
   }


}
