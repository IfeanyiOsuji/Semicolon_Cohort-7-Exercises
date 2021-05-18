package africa.semicolon.deitelExercises.tddTest.chapter_3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private char gender;
    private Date dateOfBirth;
    private double height;
    private double  weight;
    private HeartRates heartRates;
    public HealthProfile(String firstName, String lastName, char gender, Date dateOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }
    public HealthProfile(HeartRates heartRates){
        this.heartRates = heartRates;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAgeInYears() {
        return new HeartRates(getFirstName(), getLastName(), dateOfBirth ).getAgeInYears();
    }

    public int getMaximumHeartRate() {
        return new HeartRates(getFirstName(), getLastName(), dateOfBirth ).getMaximumheartRate();
    }

    public String getTargetHeartRate() {
        return new HeartRates(getFirstName(), getLastName(), dateOfBirth ).getTargetHeartRate();
    }
}
