package africa.semicolon.deitelExercises.tddTest.chapter_3;
/*
(Computerization of Health Records) A health-care issue that has been in the news lately is
the computerization of health records. This possibility is being approached cautiously because of
sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
Computerizing health records could make it easier for patients to share their health profiles and his-
tories among their various health-care professionals. This could improve the quality of health care,
help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attri-
butes should include the person’s first name, last name, gender, date of birth (consisting of separate
attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
The class also should include methods that calculate and return the user’s age in years, maximum
heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the per-
son’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
the BMI values chart from Exercise 2.33.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        assertEquals(1.5, healthProfile.getHeightInInches());
    }
    @Test
    public void testThatUserCanUpdateheight(){
        healthProfile.setHeightInInches(2.8);
        assertEquals(2.8, healthProfile.getHeightInInches());
    }
    @Test
    public void testThatUserHasWeight(){
        assertEquals(67.9, healthProfile.getWeightInPounds());
    }
    @Test
    public void testThatUserCanUpdateWeight(){
        healthProfile.setWeightInPounds(75.7);
        assertEquals(75.7, healthProfile.getWeightInPounds());
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
    @Test
    public void testThatUsersBMICanBeCalculated(){
        assertEquals(21214.977777777778, healthProfile.calculateBMI());
    }
    @Test
    public void testThatBMIValuesCanBeDisplayed(){
        assertEquals("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater",
                healthProfile.getBMIValues());
    }
}
