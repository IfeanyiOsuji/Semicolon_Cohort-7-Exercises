package africa.semicolon.deitelExercises.tddTest.chapter_3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private char gender;
    private Date dateOfBirth;
    private double height;
    private double  weight;
    public HealthProfile(String firstName, String lastName, char gender, Date dateOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;

    }

    public String getFirstName() {
        return firstName;
    }

    public Object getLastName() {
        return lastName;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }
}
