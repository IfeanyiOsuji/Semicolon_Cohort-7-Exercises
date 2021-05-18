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



}
