public class Main {
    public static void main(String[] args) {
        // Create instances of Car, Bus, and Truck
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        Bus bus = new Bus("Mercedes", "Sprinter", 2018, 30);
        Truck truck = new Truck("Volvo", "FH", 2022, 15.5);

        // Display details and call start/stop methods
        System.out.println("Car Details:");
        car.displayDetails();
        car.start();
        car.stop();

        System.out.println("\nBus Details:");
        bus.displayDetails();
        bus.start();
        bus.stop();

        System.out.println("\nTruck Details:");
        truck.displayDetails();
        truck.start();
        truck.stop();
    }
}
