public class Room {
    private int number; // Room number
    private int beds; // Number of beds in the room
    private boolean occupied; // Whether the room is occupied
    private String guestName; // Name of the guest

    // Constructor to create a room with two beds
    public Room(int number) {
        this.number = number;
        this.beds = 2; // Default to 2 beds
        this.occupied = false; // Initially not occupied
        this.guestName = ""; // No guest initially
    }

    // Constructor to create a room with a specified number of beds
    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
        this.occupied = false; // Initially not occupied
        this.guestName = ""; // No guest initially
    }

    // Method for checking in a guest
    public void checkin(String guestName) {
        this.guestName = guestName;
        this.occupied = true; // Set room to occupied
    }

    // Method for checking out a guest
    public void checkout() {
        this.guestName = ""; // Clear guest name
        this.occupied = false; // Set room to not occupied
    }

    // Method to check if the room is occupied
    public boolean isOccupied() {
        return occupied;
    }

    // Method to get room information as a string
    @Override
    public String toString() {
        return String.format("Room %d: %d beds, Occupied: %s, Guest: %s",
                number, beds, (occupied ? "Yes" : "No"), guestName.isEmpty() ? "None" : guestName);
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public int getBeds() {
        return beds;
    }

    public boolean isOccupiedRoom() {
        return occupied;
    }
    
    public String getGuestName() {
        return guestName;
    }
}

class Hotel {
    // Method to display status of a single room
    public static void displaySingleRoomStatus(Room[] rooms, int roomNumber) {
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                System.out.println(room); // Calls the toString() method
                return;
            }
        }
        System.out.println("Room not found.");
    }

    // Method to display a report of all rooms
    public static void displayRoomReport(Room[] rooms) {
        System.out.println("Room Report:");
        for (Room room : rooms) {
            System.out.println(room); // Calls the toString() method
        }
    }

    // Method to display a report limited to rooms with a specified number of beds
    public static void displayReportByBeds(Room[] rooms, int beds) {
        System.out.println("Rooms with " + beds + " beds:");
        for (Room room : rooms) {
            if (room.getBeds() == beds) {
                System.out.println(room); // Calls the toString() method
            }
        }
    }

    // Method to display how many rooms are vacant and how many are occupied
    public static void displayOccupancyReport(Room[] rooms) {
        int occupiedCount = 0;
        int vacantCount = 0;
        for (Room room : rooms) {
            if (room.isOccupiedRoom()) {
                occupiedCount++;
            } else {
                vacantCount++;
            }
        }
        System.out.println("Occupied rooms: " + occupiedCount);
        System.out.println("Vacant rooms: " + vacantCount);
    }

    // Method to display how many vacant beds are available
    public static void displayVacantBedsReport(Room[] rooms) {
        int totalVacantBeds = 0;
        for (Room room : rooms) {
            if (!room.isOccupiedRoom()) {
                totalVacantBeds += room.getBeds();
            }
        }
        System.out.println("Total vacant beds available: " + totalVacantBeds);
    }

    public static void main(String[] args) {
        // Create an array of rooms
        Room[] rooms = new Room[6];
        rooms[0] = new Room(101); // Room with 2 beds
        rooms[1] = new Room(102); // Room with 2 beds
        rooms[2] = new Room(201, 3); // Room with 3 beds
        rooms[3] = new Room(202, 3); // Room with 3 beds
        rooms[4] = new Room(301, 1); // Room with 1 bed
        rooms[5] = new Room(302, 2); // Room with 2 beds

        // Check in guests
        rooms[0].checkin("Alice");
        rooms[2].checkin("Bob");
        rooms[3].checkin("Charlie");

        // Display status of a single room
        System.out.println("Status of Room 101:");
        displaySingleRoomStatus(rooms, 101);
        
        // Display a report with a list of all rooms
        displayRoomReport(rooms);
        
        // Display a report limited to rooms with 2 beds
        displayReportByBeds(rooms, 2);
        
        // Display report on how many rooms are vacant and how many are occupied
        displayOccupancyReport(rooms);
        
        // Display report on how many vacant beds are available
        displayVacantBedsReport(rooms);
    }
}
