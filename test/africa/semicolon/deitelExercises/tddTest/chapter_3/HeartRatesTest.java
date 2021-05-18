package africa.semicolon.deitelExercises.tddTest.chapter_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeartRatesTest {
    HeartRates heartRates;
    @BeforeEach
    public void testInstanceVariables(){
        //heartRates = new HeartRates("", "Doe", new Date(5, 20, 1986));
    }
    @Test
    void testFirstName(){
        heartRates = new HeartRates(null, "Doe", new Date(5, 20, 1986));
        heartRates.setFirstName("Ifeanyi");
        assertEquals("Ifeanyi", heartRates.getFirstName());
    }
    @Test
    void  testLastLame(){
        heartRates = new HeartRates("John", null, new Date(5, 20, 1986));
        heartRates.setLastName("Paul");
        assertEquals("Paul", heartRates.getLastName());
    }
    @Test
    void testDateOfBirth(){
        heartRates = new HeartRates("", "Doe", null);
        heartRates.setDateOfBirth(new Date(2, 28, 2013));
        assertEquals("2/28/2013", heartRates.getDateOfBirth());
    }
    @Test
    void testForUserCurrentAgeInYears(){
        heartRates = new HeartRates("", "Doe", new Date(5, 12, 1987));
        int currentAge = heartRates.getAgeInYears();
        assertEquals(34, currentAge);
    }
    @Test
    void testForUserMaximumHeartRate(){
        heartRates = new HeartRates("", "Doe", new Date(5, 12, 1987));
        System.out.println(heartRates.getMaximumheartRate());
        assertEquals(186, heartRates.getMaximumheartRate());
    }
    @Test
    void testForTargetHeartRate(){
        heartRates = new HeartRates("", "Doe", new Date(5, 12, 1987));
        assertEquals("93.00 - 158.10", heartRates.getTargetHeartRate());
    }
}
