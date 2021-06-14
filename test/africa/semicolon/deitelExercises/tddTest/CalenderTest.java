package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalenderTest {
    void setUp(){
        Calender calender = new Calender();
    }
    @Test
    void getNameOfMonth(){
        Calender calender = new Calender();
        assertEquals("March", calender.getMonthName(3));
    }
    @Test
    void getNumberOfDaysInMonth(){
        Calender calender = new Calender();
        assertEquals(30, calender.getNumberOfDaysInMonth(2021, 6));
    }
    @Test
    void getTotalNumberOfDaysFrom1800(){
        Calender calender = new Calender();
        assertEquals(80870, calender.getTotalNumberOfDaysFrom1800(2021, 6));
    }
    @Test
    void getStartOfDay(){
        Calender calender = new Calender();
        assertEquals(5, calender.getStartDay(2021,1));
    }
    @Test
    void printBodyOfMonth(){
        Calender.printMonthBody(2021, 6);
    }
}
