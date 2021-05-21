package africa.semicolon.deitelExercises.tddTest.chapter_3;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private char gender;
    private Date dateOfBirth;
    private double heightInInches;
    private double weightInPounds;
    private HeartRates heartRates;
    private BMICalculator bmiCalculator = new BMICalculator();
    public HealthProfile(String firstName, String lastName, char gender, Date dateOfBirth, double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String name) {
        firstName = name;
    }
    public void setLastName(String name) {
        lastName = name;
    }
    public void setGender(char sex) {
        gender = sex;
    }
    public char getGender() {
        return gender;
    }
    public void setDateOfBirth(Date birthDate) {
        dateOfBirth = birthDate;
    }
    public String getDateOfBirth() {
        int month = dateOfBirth.getMonth();
        int day = dateOfBirth.getDay();
        int year = dateOfBirth.getYear();
        return month+"/"+day+"/"+year;
    }
    public double getHeightInInches() {
        return heightInInches;
    }
    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }
    public double getWeightInPounds() {
        return weightInPounds;
    }
    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    public int getAgeInYears() {
        return new HeartRates(firstName, lastName, dateOfBirth ).getAgeInYears();
    }
    public int getMaximumHeartRate() {
        return new HeartRates(firstName, lastName, dateOfBirth ).getMaximumheartRate();
    }
    public String getTargetHeartRate() {
        return new HeartRates(firstName, lastName, dateOfBirth ).getTargetHeartRate();
    }

    public double calculateBMI() {
        bmiCalculator.setWeightInPounds(weightInPounds);
        bmiCalculator.setHeightInInches(heightInInches);
        return bmiCalculator.calculateBMIUsingWeightInPoundsAndHeightInInches();
    }
    public String getBMIValues() {
        return bmiCalculator.getValues();
    }
}
