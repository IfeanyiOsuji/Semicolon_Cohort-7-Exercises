package africa.semicolon.deitelExercises.tddTest.chapter_3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
/*
(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
your heart rate stays within a safe range suggested by your trainers and doctors. According to the Amer-
ican Heart Association (AHA) ( www.americanheart.org/presenter.jhtml?identifier=4736 ), the
formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
and gender of the individual. Always consult a physician or qualified health-care professional before
beginning or modifying an exercise program.] Create a class called HeartRates . The class attributes
should include the person’s first name, last name and date of birth (consisting of separate attributes for
the month, day and year of birth). Your class should have a constructor that receives this data as pa-
rameters. For each attribute provide set and get methods. The class also should include a method that
calculates and returns the person’s age (in years), a method that calculates and returns the person’s
maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
Java app that prompts for the person’s information, instantiates an object of class HeartRates and
prints the information from that object—including the person’s first name, last name and date of
birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
range.
 */

public class HeartRates {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public HeartRates(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if(this.firstName == null || this.firstName == "")
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if(this.lastName == null || this.lastName == "")
        this.lastName = lastName;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth.getMonth()+"/"+dateOfBirth.getDay()+"/"+dateOfBirth.getYear();
    }
    public int getAgeInYears(){
        LocalDate currentDate = LocalDate.now();
        int currentDay = currentDate.getDayOfMonth();
        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();
        if(currentMonth < dateOfBirth.getMonth() || currentDay < dateOfBirth.getDay())
            return (currentYear -dateOfBirth.getYear()) -1;
        else
            return currentYear - dateOfBirth.getYear();
    }
    public int getMaximumheartRate() {
        if(220 >= getAgeInYears())
        return 220 - getAgeInYears();
        else
            return getAgeInYears() - 220;
    }
    public String getTargetHeartRate() {
        double fiftyPercentHeartRate = (50.0/100) * getMaximumheartRate();
        double eightyFivePercentHeartRate = (85.0/100) * getMaximumheartRate();
        return String.format("%.2f - %.2f",fiftyPercentHeartRate, eightyFivePercentHeartRate);
    }
}
