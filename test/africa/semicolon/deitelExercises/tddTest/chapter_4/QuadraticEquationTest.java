package africa.semicolon.deitelExercises.tddTest.chapter_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


public class QuadraticEquationTest {
   // QuadraticEquation quadraticEquation;
    @Test
public void testForPositivityOfRoots(){
    QuadraticEquation quadraticEquation = new QuadraticEquation(2, 4, 2);
        assertTrue(quadraticEquation.isPositiveRoot());
    }
    @Test
    public void testForNegativityOfRoot(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(6, 4, 2);
        assertFalse(quadraticEquation.isPositiveRoot());
    }
    @Test
    void testToFindIfEquationHasOneRoot(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(2, 4, 2);
        assertEquals(1, quadraticEquation.findRoots());
    }
    @Test
    void testToFindIfEquationHasTwoRoots(){
        QuadraticEquation quadraticEquation = new QuadraticEquation(4, 6, 2);
        assertEquals(2, quadraticEquation.findRoots());
    }
}
