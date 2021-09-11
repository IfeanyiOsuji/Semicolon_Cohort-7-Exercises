package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequenceAndSeriesTest {
    SequenceAndSeries sequenceAndSeries;
    @BeforeEach
    void setUp(){
        sequenceAndSeries = new SequenceAndSeries();
    }
    @Test
    void testForArithmeticIncrease(){
        assertEquals(8, SequenceAndSeries.getNextArithmeticTerm(2,4, 2, 4));
    }
    @Test
    void testForGeometricIncrease(){
        assertEquals(54,SequenceAndSeries.getNextGeometricTerms(2,6,18,3,4));
    }
    @Test
    void testForSumOfTermsInArithmeticProgression(){

    }
}

