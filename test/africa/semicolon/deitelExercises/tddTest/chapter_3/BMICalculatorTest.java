package africa.semicolon.deitelExercises.tddTest.chapter_3;
/*
(Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
Exercise 1.10. The formulas for calculating BMI are

BMI = weightInPounds × 703 / (heightInInches × heightInInches)
or
BMI = weightInKilograms / (heightInMeters × heightInMeters)

Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you pre-
fer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
body mass index. Also, display the following information from the Department of Health and
Human Services/National Institutes of Health so the user can evaluate his/her BMI:
BMI VALUES
Underweight:    less than 18.5
Normal:         between 18.5 and 24.9
Overweight:     between 25 and 29.9
Obese:          30 or greater
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {
    private BMICalculator bmiCalculator;
    @BeforeEach
    public void doThisFirst(){
        bmiCalculator = new BMICalculator();
    }
    @Test
    public void testThatCalculatorCanSetAndCheckWeightInPounds(){
        bmiCalculator.setWeightInPounds(20.0);
        assertEquals(20.0, bmiCalculator.getWeightInPounds());
    }
    @Test
    public void testThatCalculatorCanSetAndCheckWeightInKilograms(){
        bmiCalculator.setWeightInKilograms(20.0);
        assertEquals(20.0, bmiCalculator.getWeightInKilograms());
    }
    @Test
    public void testThatCalculatorCanSetAndGetHeightInInches(){
        bmiCalculator.setHeightInInches(2.5);
        assertEquals(2.5, bmiCalculator.getHeightInInches());
    }
    @Test
    public void testThatUserCanSetAndGetHeightInMeters(){
        bmiCalculator.setHeightInMeters(1.5);
        assertEquals(1.5, bmiCalculator.getHeightInMeters());
    }
    @Test
    public void testThatBMICanBeCalculatedUsingWeightInPoundsAndHeightInInches(){
        bmiCalculator.setWeightInPounds(20.0);
        bmiCalculator.setHeightInInches(2.5);
        assertEquals(2249.6, bmiCalculator.calculateBMI(bmiCalculator.getWeightInPounds(), bmiCalculator.getHeightInInches()));
    }
    @Test
    public void testThatBMICanBeCalculatedUsingWeightInKilogramsAndHeightInMeters(){
        bmiCalculator.setWeightInKilograms(20.0);
        bmiCalculator.setHeightInMeters(1.5);
        assertEquals(8.88888888888889, bmiCalculator.calculateBMI(bmiCalculator.getWeightInKilograms(), bmiCalculator.getHeightInMeters()));
    }
    @Test
    public void testThatBMIInfoCanBeDisplayed(){
        assertEquals("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater",
                bmiCalculator.getValues());
    }
}

