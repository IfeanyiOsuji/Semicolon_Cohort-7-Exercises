package africa.semicolon.deitelExercises.tddTest.chapter_3;

public class BMICalculator {

    private double weightInPounds;
    private double weightInKilograms;
    private double heightInInches;
    private double heightInMeters;

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public void setWeightInKilograms(double weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
    }

    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public double calculateBMI(double weight, double height) {
        double BMI = 0;
        if(weight == weightInPounds && height == heightInInches){
            BMI = (weight * 703) / (height *height);
        }
        if(weight == weightInKilograms && height == heightInMeters){
            BMI = (weight) / (height *height);
        }

        return BMI;
    }

    public String getValues() {
        return "BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 24.9\nOverweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater";
    }
}
