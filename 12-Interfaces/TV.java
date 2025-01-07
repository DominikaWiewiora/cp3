import java.util.Arrays;

interface CanOnOff {
    void on();
    void off();
}

interface CanChangeChannel {
    void channelUp();
    void channelDown();
    void setChannel(int channelNo);
}

interface CanChangeVolume {
    void volumeUp();
    void volumeDown();
}

public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isOn;
    private int channel;
    private int volume;
    private String[] tvStations;

    // Constructor
    public TV() {
        this.isOn = false;
        this.channel = 1;
        this.volume = 1;

        // Initialize TV stations
        this.tvStations = new String[99];
        this.tvStations[0] = "News Channel";
        this.tvStations[1] = "Sports Channel";
        this.tvStations[2] = "Movie Channel";
        this.tvStations[3] = "Music Channel";
        this.tvStations[4] = "Kids Channel";
        this.tvStations[5] = "Documentary Channel";
        this.tvStations[6] = "Cooking Channel";
        this.tvStations[7] = "History Channel";
        this.tvStations[8] = "Science Channel";
        this.tvStations[9] = "Travel Channel";
        Arrays.fill(this.tvStations, 10, this.tvStations.length, null);
    }

    // Implement CanOnOff methods
    @Override
    public void on() {
        if (!isOn) {
            isOn = true;
            channel = 1;  // Reset to default channel
            volume = 1;   // Reset to default volume
            System.out.println("The TV is now ON.");
        }
    }

    @Override
    public void off() {
        if (isOn) {
            isOn = false;
            System.out.println("The TV is now OFF.");
        }
    }

    // Implement CanChangeChannel methods
    @Override
    public void channelUp() {
        if (isOn && channel < 99) {
            channel++;
            System.out.println("Channel changed to " + channel);
        } else if (!isOn) {
            System.out.println("The TV is OFF. Turn it ON to change channels.");
        }
    }

    @Override
    public void channelDown() {
        if (isOn && channel > 1) {
            channel--;
            System.out.println("Channel changed to " + channel);
        } else if (!isOn) {
            System.out.println("The TV is OFF. Turn it ON to change channels.");
        }
    }

    @Override
    public void setChannel(int channelNo) {
        if (isOn) {
            if (channelNo >= 1 && channelNo <= 99) {
                channel = channelNo;
                System.out.println("Channel set to " + channel);
            } else {
                System.out.println("Invalid channel number. Please select a channel between 1 and 99.");
            }
        } else {
            System.out.println("The TV is OFF. Turn it ON to set the channel.");
        }
    }

    // Implement CanChangeVolume methods
    @Override
    public void volumeUp() {
        if (isOn && volume < 10) {
            volume++;
            System.out.println("Volume increased to " + volume);
        } else if (!isOn) {
            System.out.println("The TV is OFF. Turn it ON to adjust volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 1) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        } else if (!isOn) {
            System.out.println("The TV is OFF. Turn it ON to adjust volume.");
        }
    }

    // Display TV status
    public void displayStatus() {
        if (isOn) {
            String station = (tvStations[channel - 1] != null) ? tvStations[channel - 1] : "No Station Assigned";
            System.out.println("The TV is ON. Channel: " + channel + " (" + station + "), Volume: " + volume);
        } else {
            System.out.println("The TV is OFF.");
        }
    }

    // Display list of TV stations
    public void displayStations() {
        System.out.println("List of TV stations:");
        for (int i = 0; i < tvStations.length; i++) {
            if (tvStations[i] != null) {
                System.out.println("Channel " + (i + 1) + ": " + tvStations[i]);
            }
        }
    }
}
