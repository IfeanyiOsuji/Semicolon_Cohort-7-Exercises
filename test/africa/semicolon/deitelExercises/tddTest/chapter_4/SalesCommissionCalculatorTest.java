package africa.semicolon.deitelExercises.tddTest.chapter_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionCalculatorTest {
    @Test
    void setUp(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
    }
    @Test
    void validateThatItemOneIsSoldFor239_99(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        assertEquals(239.99, salesCommissionCalculator.getValueOfItemSold(1));
    }
    @Test
    void validateThatItemTwoIsSoldFor129_75(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        assertEquals(129.75, salesCommissionCalculator.getValueOfItemSold(2));
    }
    @Test
    void validateThatItemThreeIsSoldFor129_75(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        assertEquals(99.95, salesCommissionCalculator.getValueOfItemSold(3));
    }
    @Test
    void validateThatItemFourIsSoldFor350_89(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        assertEquals(350.89, salesCommissionCalculator.getValueOfItemSold(4));
    }
    @Test
    void testSalesPersonGrossSaleForTheWeek(){
        SalesCommissionCalculator bola = new SalesCommissionCalculator();
        bola.makeSale(1);
        bola.makeSale(3);
        bola.makeSale(1);
        bola.makeSale(4);
        assertEquals(930.82, bola.getTotalSalesForTheWeek());
    }
    @Test
    void testSalesPersonCommissionForTheWeek(){
        SalesCommissionCalculator bola = new SalesCommissionCalculator();
        bola.makeSale(1);
        bola.makeSale(3);
        bola.makeSale(1);
        bola.makeSale(4);
        assertEquals(283.7738, bola.getCommissionForTheWeek());
    }
}
