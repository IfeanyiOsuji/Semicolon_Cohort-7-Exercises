package africa.semicolon.deitelExercises.tddTest;

public class Television {

    private final String manufacturerName;
    private int screenSize;
    private int channel;
    private boolean powerOn;
    private int volume;

    public Television(int size){
        manufacturerName = "LG";
        screenSize = size;
        channel = 35;
        volume = 10;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setChannel(int channel) {
        if(powerOn) {
            if(channel > 0 && channel <= 150)
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public String getManucturerName() {
        return manufacturerName;
    }

    public void displayNextChannel() {
        if(powerOn) {
            if(channel < 150)
            channel++;
        }
    }

    public void displayPreviousChannel() {
        if(powerOn) {
            if(channel>1)
            channel--;
        }
    }

    public boolean powerOn() {
        return powerOn;
    }

    public void power(boolean isOn) {
        powerOn = isOn;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(volume<50)
        volume += 2;
    }

    public void reduceVolume() {
        if(volume > 2)
        volume -=2;
    }
}
