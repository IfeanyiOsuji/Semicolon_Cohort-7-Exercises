package africa.semicolon.deitelExercises.tddTest.chapter_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
            PSEUDOCODE
            - The user inputs the first value which is initialized to be the highest
            - the user initialises counter to 1;
            - while counter is not above the limit, keep collecting the number
                if the highest which is the first number is less than the next input,
                assign the highest input to highest.
             - print highest;
             */
public class HighestValueTest {
   @Test
   void setUp(){
       HighestValue highestValue = new HighestValue();
   }
   @Test
    void showTheHighestValue(){
       HighestValue highestValue = new HighestValue();
       assertEquals(100, highestValue.getHighestValue());
   }
}
