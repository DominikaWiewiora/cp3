public class InternetDevice {
    private String name; // Name of the device
    private boolean connected; // Whether the device is connected to the Internet
    private static int connectedDevices = 0; // Static field to track connected devices

    // Constructor
    public InternetDevice(String name) {
        this.name = name;
        this.connected = false; // Initialize as not connected
    }

    // Method to connect the device
    public void connect() {
        if (!connected) {
            connected = true; // Set connected status to true
            connectedDevices++; // Increment the count of connected devices
            System.out.println(name + " is now connected.");
        } else {
            System.out.println(name + " is already connected.");
        }
    }

    // Method to disconnect the device
    public void disconnect() {
        if (connected) {
            connected = false; // Set connected status to false
            connectedDevices--; // Decrement the count of connected devices
            System.out.println(name + " is now disconnected.");
        } else {
            System.out.println(name + " is already disconnected.");
        }
    }

    // Method to check if the device is connected
    public boolean isConnected() {
        return connected; // Return the connection status
    }

    // Method to display the status of the device
    public void displayStatus() {
        String status = connected ? "connected" : "not connected"; // Determine status
        System.out.println(name + " is " + status + " to the Internet.");
    }

    // Static method to display the number of connected devices
    public static void displayConnections() {
        System.out.println("Number of devices connected to the Internet: " + connectedDevices);
    }

    public static void main(String[] args) {
        // Create five different internet devices
        InternetDevice pc = new InternetDevice("Personal Computer");
        InternetDevice laptop = new InternetDevice("Laptop");
        InternetDevice tablet = new InternetDevice("Tablet");
        InternetDevice smartphone = new InternetDevice("Smartphone");
        InternetDevice internetRadio = new InternetDevice("Internet Radio");

        // Connect some devices
        pc.connect();          // Connect Personal Computer
        laptop.connect();      // Connect Laptop
        tablet.connect();      // Connect Tablet (this one will not be connected)
        
        smartphone.connect();  // Connect Smartphone
        internetRadio.disconnect(); // Disconnect Internet Radio (not connected)

        // Display the status of each device
        pc.displayStatus();
        laptop.displayStatus();
        tablet.displayStatus();
        smartphone.displayStatus();
        internetRadio.displayStatus();

        // Display the total number of connected devices
        InternetDevice.displayConnections();
    }
}

