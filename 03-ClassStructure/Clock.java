public class Clock {
    private int hour; // Hour value ranging from 0 to 23
    private int minute; // Minute value ranging from 0 to 59
    private int alarmHour; // Alarm hour
    private int alarmMinute; // Alarm minute
    private boolean alarmSet; // Indicates whether the alarm is set

    // Constructor to initialize clock to 00:00
    public Clock() {
        this.hour = 0;
        this.minute = 0;
        this.alarmSet = false; // Alarm is initially off
    }

    // Constructor to initialize clock to specific hour and minute
    public Clock(int hour, int minute) {
        setClock(hour, minute); // Use the setClock method for validation
        this.alarmSet = false; // Alarm is initially off
    }

    // Method to set the clock to a specific hour and minute
    public void setClock(int hour, int minute) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour; // Valid hour
        } else {
            System.out.println("Invalid hour. Setting hour to 0.");
            this.hour = 0; // Default to 0 if invalid
        }
        
        if (minute >= 0 && minute < 60) {
            this.minute = minute; // Valid minute
        } else {
            System.out.println("Invalid minute. Setting minute to 0.");
            this.minute = 0; // Default to 0 if invalid
        }
    }

    // Method to reset clock to 00:00
    public void setClock() {
        this.hour = 0;
        this.minute = 0;
    }

    // Method to display the time in HH:MM format
    public void displayTime() {
        System.out.printf("Time: %02d:%02d\n", hour, minute); // Format the time
    }

    // Method to add one minute to the clock
    public void addOneMinute() {
        minute++; // Increment the minute
        if (minute >= 60) { // Check if minute rolls over
            minute = 0; // Reset minute
            hour++; // Increment hour
            if (hour >= 24) { // Check if hour rolls over
                hour = 0; // Reset hour
            }
        }
        runAlarm(); // Check if the alarm should ring
    }

    // Method to set the alarm
    public void setAlarm(int hour, int minute) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60) {
            this.alarmHour = hour; // Valid hour for alarm
            this.alarmMinute = minute; // Valid minute for alarm
            this.alarmSet = true; // Set the alarm
            System.out.printf("Alarm set for %02d:%02d\n", alarmHour, alarmMinute);
        } else {
            System.out.println("Invalid time for alarm. Please enter a valid hour (0-23) and minute (0-59).");
        }
    }

    // Method to run the alarm if the current time matches the alarm time
    public void runAlarm() {
        if (alarmSet && hour == alarmHour && minute == alarmMinute) {
            System.out.println("beep-beep-beep-beep !! Alarm is ringing!");
            alarmSet = false; // Turn off the alarm after it rings
        }
    }

    // Main method to test the Clock class
    public static void main(String[] args) {
        // Create a clock with starting time 12:47
        Clock clock = new Clock(12, 47);
        clock.displayTime(); // Display time

        // Set an alarm for 12:48
        clock.setAlarm(12, 48);

        // Add minutes to see the alarm in action
        for (int i = 0; i < 2; i++) {
            clock.addOneMinute(); // This will trigger the alarm on the second addition
            clock.displayTime(); // Display time after each addition
        }

        // Set a clock to 18:14
        clock.setClock(18, 14);
        clock.displayTime(); // Display time

        // Set another alarm for 18:15
        clock.setAlarm(18, 15);
        clock.addOneMinute(); // This should trigger the alarm
        clock.displayTime(); // Display time

        // Set a clock to 09:03
        clock.setClock(9, 3);
        clock.displayTime(); // Display time

        // Set a clock to 23:58
        clock.setClock(23, 58);
        clock.displayTime(); // Display time

        // Add one minute
        clock.addOneMinute();
        clock.displayTime(); // Display time

        // Add one minute
        clock.addOneMinute();
        clock.displayTime(); // Display time
    }
}
