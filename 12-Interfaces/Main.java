public class Main {
    public static void main(String[] args) {
        TV myTV = new TV(); // Create a TV object

        // Turn on the TV
        myTV.on();

        // Display TV status
        myTV.displayStatus();

        // Change channel number to 15
        myTV.setChannel(15);

        // Set volume level to 7
        for (int i = 1; i < 7; i++) {  // Increase volume to 7
            myTV.volumeUp();
        }

        // Display TV status
        myTV.displayStatus();

        // Turn off the TV
        myTV.off();

        // Display TV status
        myTV.displayStatus();
    }
}
