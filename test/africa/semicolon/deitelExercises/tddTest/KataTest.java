package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    Kata kata;
    @BeforeEach
    public void initializeKataObject(){
        kata = new Kata();
    }
    @Test
    public void testThatPriceByQuantityIsAccurate(){
        // 1 - 4 copies
        assertEquals(1500, kata.determinePriceByQuantity(1));
        assertEquals(3000, kata.determinePriceByQuantity(2));
        assertEquals(6000, kata.determinePriceByQuantity(4));
        // 5 - 9 copies
        assertEquals(7000, kata.determinePriceByQuantity(5));
        assertEquals(9800, kata.determinePriceByQuantity(7));
        assertEquals(12600, kata.determinePriceByQuantity(9));
        // 10 - 29 copies
        assertEquals(12000, kata.determinePriceByQuantity(10));
        assertEquals(24000, kata.determinePriceByQuantity(20));
        assertEquals(34800, kata.determinePriceByQuantity(29));
        // 30 - 49 copies
        assertEquals(33000, kata.determinePriceByQuantity(30));
        assertEquals(44000, kata.determinePriceByQuantity(40));
        assertEquals(53900, kata.determinePriceByQuantity(49));
        // 50 - 99
        assertEquals(50000, kata.determinePriceByQuantity(50));
        assertEquals(70000, kata.determinePriceByQuantity(70));
        assertEquals(99000, kata.determinePriceByQuantity(99));
        //100 - 199
        assertEquals(90000, kata.determinePriceByQuantity(100));
        assertEquals(135000, kata.determinePriceByQuantity(150));
        assertEquals(179100, kata.determinePriceByQuantity(199));
        // 200 - above
        assertEquals(160000, kata.determinePriceByQuantity(200));
        assertEquals(240000, kata.determinePriceByQuantity(300));
        assertEquals(800000, kata.determinePriceByQuantity(1000));
        assertEquals(8000000, kata.determinePriceByQuantity(10000));

    }


}
