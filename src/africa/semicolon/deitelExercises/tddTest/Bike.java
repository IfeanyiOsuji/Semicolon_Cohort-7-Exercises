package africa.semicolon.deitelExercises.tddTest;

public class Bike {

    private int speedInKmPerHour;
    private boolean isOn;
    private int currentGearNumber;


    public void setSpeedInKmPerHour(int newSpeedInKmPerHour) {
        if(isOn) {
            speedInKmPerHour = newSpeedInKmPerHour;
        }
    }

    public int getSpeedInKmPerHour() {
        return speedInKmPerHour;
    }

    public boolean isOn(){
        return isOn;
    }

    public void setOn(boolean isOn) {

        this.isOn = isOn;

        if(this.isOn){
            currentGearNumber = 1;
        } else{
            currentGearNumber = 0;
        }
    }

    public int getCurrentGearNumber() {
        return currentGearNumber;
    }

    public void speedUp() {
        accelerate();
        speedInKmPerHour = speedInKmPerHour + currentGearNumber;
    }

    private void accelerate() {
        if (speedInKmPerHour >=20 && speedInKmPerHour < 40){
            currentGearNumber = 2;
        }
        if(speedInKmPerHour >=40 && speedInKmPerHour < 70){
            currentGearNumber = 3;
        }
        if(speedInKmPerHour >= 70){
            currentGearNumber = 4;
        }
    }

    public void slowDown() {
        decelerate();
        speedInKmPerHour = speedInKmPerHour - currentGearNumber;
    }

    public void decelerate(){
        if(speedInKmPerHour > 70){
            currentGearNumber = 4;
        }
        if(speedInKmPerHour > 40 && speedInKmPerHour <= 70){
            currentGearNumber = 3;
        }
        if(speedInKmPerHour > 20 && speedInKmPerHour <= 40){
            currentGearNumber = 2;
        }
        if (speedInKmPerHour >= 1 && speedInKmPerHour <= 20){
            currentGearNumber = 1;
        }
    }
}
