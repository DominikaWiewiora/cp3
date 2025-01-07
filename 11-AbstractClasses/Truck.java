public class Truck extends Vehicle {
    private double loadCapacity; // Load capacity in tons

    // Constructor to initialize Truck object
    public Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year); // Call parent class constructor
        this.loadCapacity = loadCapacity;
    }

    // Implement start method
    @Override
    public void start() {
        System.out.println("The truck is starting.");
    }

    // Implement stop method
    @Override
    public void stop() {
        System.out.println("The truck has stopped.");
    }

    // Display truck details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
