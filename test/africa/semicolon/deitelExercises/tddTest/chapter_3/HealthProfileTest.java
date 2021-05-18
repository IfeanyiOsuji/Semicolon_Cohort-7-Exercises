package africa.semicolon.deitelExercises.tddTest.chapter_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class HealthProfileTest {
    HealthProfile healthProfile;
    @BeforeEach
    public void testInizializedConstructors(){
        healthProfile = new HealthProfile("John", "Paul", 'M', new Date(5, 17, 1999),
                1.5, 67.9);
    }
    @Test
    public void testThatUserHasFirstName(){
        assertEquals("John", healthProfile.getFirstName());
    }
    @Test
    public void testThatUserCanUpdateFirstName(){
        healthProfile.setFirstName("Luke");
        assertEquals("Luke", healthProfile.getFirstName());
    }
    @Test
    public void testThatUserHasLastName(){
        assertEquals("Paul", healthProfile.getLastName());
    }
    @Test
    public void testThatUserCanUpdateLastName(){
        healthProfile.setLastName("Mark");
        assertEquals("Mark", healthProfile.getLastName());
    }
    @Test
    public void testThatUserHasGender(){
        healthProfile.setGender('M');
        assertEquals('M', healthProfile.getGender());
    }
    @Test
    public void testThatUserHasDateOfBirth(){
        assertEquals("5/17/1999", healthProfile.getDateOfBirth());
    }
    @Test
    public void testThatUserCanUpdateDateOfBirth(){
        healthProfile.setDateOfBirth(new Date(5, 10, 1996));
        assertEquals("5/10/1996", healthProfile.getDateOfBirth());
    }
    @Test
    public void testThatUserHasHeight(){
        assertEquals(1.5, healthProfile.getHeight());
    }
    @Test
    public void testThatUserCanUpdateheight(){
        healthProfile.setHeight(2.8);
        assertEquals(2.8, healthProfile.getHeight());
    }
    @Test
    public void testThatUserHasWeight(){
        assertEquals(67.9, healthProfile.getWeight());
    }
    @Test
    public void testThatUserCanUpdateWeight(){
        healthProfile.setWeight(75.7);
        assertEquals(75.7, healthProfile.getWeight());
    }
    @Test
    public void testToDetermineUsersAgeInYearsCanBeDetermined(){
        assertEquals(22, healthProfile.getAgeInYears());
    }
    @Test
    public void testThatUsersMaximumHeartRateCanBeDetermined(){
        assertEquals(198, healthProfile.getMaximumHeartRate());
    }
    @Test
    public void displayUsersTargetHeartRate(){
        assertEquals("99.00 - 168.30", healthProfile.getTargetHeartRate());
    }
}
