package africa.semicolon.deitelExercises.tddTest;

public class AirConditioner {
    private String productName;
    private boolean isOn;
    private int temperature;
    public AirConditioner(String name) {
        productName = name;
        temperature = 16;
    }

    public String getName() {

        return productName;
    }
    public void decreaseTemperature() {
        if(isOn) {
            if (temperature >= 16)
                temperature = temperature - 1;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(isOn) {
            if (temperature < 30) {
                temperature = temperature + 1;
            }
        }
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (isOn == true) {
            if (temperature >= 16 && temperature <= 30)
                temperature = currentTemperature;
        }
    }

    public void setOn(boolean isACOn) {
        isOn = isACOn;
    }

    public boolean isOn() {
        return isOn;
    }
}
