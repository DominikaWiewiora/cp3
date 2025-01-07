public class Car extends Vehicle {
    private int doors; // Number of doors in the car

    // Constructor to initialize Car object
    public Car(String make, String model, int year, int doors) {
        super(make, model, year); // Call parent class constructor
        this.doors = doors;
    }

    // Implement start method
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    // Implement stop method
    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }

    // Display car details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + doors);
    }
}
