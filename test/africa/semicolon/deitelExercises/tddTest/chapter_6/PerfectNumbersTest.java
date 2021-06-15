package africa.semicolon.deitelExercises.tddTest.chapter_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersTest {
    void setUp() {
        PerfectNumbers numbers = new PerfectNumbers();
    }

    @Test
    void findFactorsOfnumber() {
        assertEquals("1,2,3", PerfectNumbers.findFactors(6, 2));
        assertEquals("1,2,2,3", PerfectNumbers.findFactors(12, 2));
        assertEquals("1,2,2,2,3,5", PerfectNumbers.findFactors(120, 2));
        assertEquals("1,2,2,5,5,5", PerfectNumbers.findFactors(500, 2));
        assertEquals("1,2,2,2,5,5,5", PerfectNumbers.findFactors(1000, 2));
    }

    @Test
    void isNumberAPerfectSquare() {
        assertTrue(PerfectNumbers.isPerfect(6, 2));
        assertFalse(PerfectNumbers.isPerfect(12, 2));
        assertFalse(PerfectNumbers.isPerfect(120, 2));
        assertFalse(PerfectNumbers.isPerfect(500, 2));
        assertFalse(PerfectNumbers.isPerfect(500, 2));
    }
}

