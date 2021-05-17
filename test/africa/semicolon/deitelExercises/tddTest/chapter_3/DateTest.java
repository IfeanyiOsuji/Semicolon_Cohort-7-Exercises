package africa.semicolon.deitelExercises.tddTest.chapter_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {

   // Date date = new Date(11, 23, 2021);
    @Test
    public void testInstanceVaribles(){
        Date date = new Date(11, 23, 2021);
        date.setMonth(13);
        assertEquals(13, date.getMonth());
        date.setDay(31);
        assertEquals(31, date.getDay());
        date.setYear(2017);
        assertEquals(2017, date.getYear());
    }
    @Test
    public void testThatMonthIsValid(){
        Date date = new Date(11, 23, 2021);
        date.setMonth(13);
        assertEquals("11/23/2021", date.displayDate());
    }
    @Test
    public void testThatDayIsValid(){
        Date date = new Date(11, 23, 2021);
        date.setDay(31);
        assertEquals("11/23/2021", date.displayDate());
    }
    @Test
    public void testDisplayDate(){
        Date date = new Date(1, 31, 2021);
        date.displayDate();
    }

}
