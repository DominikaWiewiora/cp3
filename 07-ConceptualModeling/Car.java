public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    // Constructor to initialize the Car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0; // Default speed is 0
    }

    // Getter methods for encapsulated fields
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    // Method to accelerate the car
    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
            System.out.println("The car accelerated by " + increment + " km/h. Current speed: " + speed + " km/h.");
        } else {
            System.out.println("Invalid acceleration value.");
        }
    }

    // Method to apply brakes
    public void brake(int decrement) {
        if (decrement > 0) {
            speed -= decrement;
            if (speed < 0) {
                speed = 0; // Speed cannot be negative
            }
            System.out.println("The car decelerated by " + decrement + " km/h. Current speed: " + speed + " km/h.");
        } else {
            System.out.println("Invalid braking value.");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create two Car objects
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Ford", "Mustang", 2022);

        // Display attributes and call methods
        System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " (" + car1.getYear() + ")");
        car1.accelerate(50);
        car1.brake(20);

        System.out.println();

        System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel() + " (" + car2.getYear() + ")");
        car2.accelerate(80);
        car2.brake(40);
    }
}

