public abstract class Vehicle {
    // Common attributes
    protected String make;
    protected String model;
    protected int year;

    // Constructor to initialize vehicle
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract methods (must be implemented by subclasses)
    public abstract void start();
    public abstract void stop();

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
