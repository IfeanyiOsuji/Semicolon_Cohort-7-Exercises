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
    @Test
    public void testToDetermineSellersProfit(){
        // 1 - 4 copies
        assertEquals(500, kata.getSellersProfit(1));
        assertEquals(1000, kata.getSellersProfit(2));
        assertEquals(2000, kata.getSellersProfit(4));
        // 5 - 9 copies
        assertEquals(3000, kata.getSellersProfit(5));
        assertEquals(4200, kata.getSellersProfit(7));
        assertEquals(5400, kata.getSellersProfit(9));
        assertEquals(240000, kata.getSellersProfit(200));

    }
    @Test
    public void  testThatNumberReturnsItsNumberOfFactors(){
        assertEquals(4, kata.getNumberOfFactorsOfNumber(10));
        assertEquals(6, kata.getNumberOfFactorsOfNumber(20));
        assertEquals(9, kata.getNumberOfFactorsOfNumber(100));
        assertEquals(16, kata.getNumberOfFactorsOfNumber(1000));
        assertEquals(8, kata.getNumberOfFactorsOfNumber(56));
    }
    @Test
    public void testThatNumberCanBeReveresd(){
        Kata kata = new Kata();
        assertEquals("54321", kata.reverseOrder(12345));
    }
    @Test
    public void testTheFactorialOfANumber(){
        Kata kata = new Kata();
        assertEquals(720,kata.findFactorialOf(6) );
    }
    @Test
    void findMaximumElementInAnArrayTest(){
        int [] elements = {34, 54, 65, 78, 100, 120, 90, 45, 12, 32};
        int max = Kata.findMaxElementInArray(elements);
        assertEquals(120, max);

    }
    @Test
    void findMinimumElementInArray(){
        int [] elements = {34, 54, 65, 78, 100, 120, 90, 45, 12, 32};
        int min = Kata.findMinElementInArray(elements);
        assertEquals(12, min);
    }
    @Test
    void findAverageOfElementsInArray(){
        int [] elements = {34, 54, 65, 78, 100, 120, 90, 45, 12, 32};
        double avarage = Kata.findAverageOfElementsInArray(elements);
        assertEquals(63.0, avarage);
    }
    @Test
    void findTheSumOfTheElementsOfTheArray(){
        int [] arr = {5,6,9,10,4,2,6};
        assertEquals(42, Kata.findSumOfElements(arr));
    }
    @Test
    void findMaximumOfTheSumAfterEachElementIsRemoved(){
        int [] arr = {5,6,9,10,4,2,6};
        assertEquals(40, Kata.findMaximumOfSumAfterRemovingEachElement(arr));
    }
    @Test
    void findMinimumOfTheSumAfterEachElementIsRemoved(){
        int [] arr = {5,6,9,10,4,2,6};
        assertEquals(32, Kata.findMinimumOfSumAfterRemovingEachElement(arr));
    }

}
