package africa.semicolon.deitelExercises.tddTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionerTest {
    AirConditioner airconditioner;
    @BeforeEach
    public void testConstructor(){
        airconditioner = new AirConditioner("Heier Thermacool");

    }
    @Test
    public void testThatAirConditionerHasAName(){
        assertEquals("Heier Thermacool", airconditioner.getName());
    }
    @Test
    public void testThatAirconditionerCanBeSetOnAndOff(){
        airconditioner.setOn(true);
        assertTrue(airconditioner.isOn());
        airconditioner.setOn(false);
        assertFalse(false);
    }
    @Test
    public void testThatTemperatureCannotBeSetWhenACIsOff(){
        airconditioner.setOn(false);
        airconditioner.setCurrentTemperature(20);
        assertEquals(16, airconditioner.getTemperature());
    }
    @Test
    public void testThatTemperatureCannotBeChangedWhenACIsOff(){
        airconditioner.setOn(true);
        airconditioner.increaseTemperature();
        assertEquals(17, airconditioner.getTemperature());
        airconditioner.setOn(false);
        airconditioner.setCurrentTemperature(29);
        airconditioner.decreaseTemperature();
        assertEquals(29, airconditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanIncreaseInTemperature(){
        airconditioner.setOn(true);
        airconditioner.setCurrentTemperature(29);
        airconditioner.increaseTemperature();
        assertEquals(30, airconditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionerCanDecreaseInTemperature(){
        airconditioner.setOn(true);
        airconditioner.setCurrentTemperature(30);
        airconditioner.decreaseTemperature();
        assertEquals(29, airconditioner.getTemperature());
    }

}
