public class Bus extends Vehicle {
    private int seatingCapacity; // Number of seats in the bus

    // Constructor to initialize Bus object
    public Bus(String make, String model, int year, int seatingCapacity) {
        super(make, model, year); // Call parent class constructor
        this.seatingCapacity = seatingCapacity;
    }

    // Implement start method
    @Override
    public void start() {
        System.out.println("The bus is starting.");
    }

    // Implement stop method
    @Override
    public void stop() {
        System.out.println("The bus has stopped.");
    }

    // Display bus details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}