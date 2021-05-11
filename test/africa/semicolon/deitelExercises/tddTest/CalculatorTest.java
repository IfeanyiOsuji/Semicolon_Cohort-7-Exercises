package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testThatCalculatorCanAdd(){
        Calculator calculator = new Calculator();
       int add = calculator.add(2, 7);
       assertEquals(9, add);

    }
    @Test
    public void testThatCalculatorCanMultipy(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 7);
        assertEquals(14, result);

    }
    @Test
    public void testThatCalculatorCanSubtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }
    @Test
    public void testThatCalculatorCanDivide(){
        Calculator calculator = new Calculator();
        double result = calculator.divide( 5, 0);
        assertEquals(0, result);
    }
}
