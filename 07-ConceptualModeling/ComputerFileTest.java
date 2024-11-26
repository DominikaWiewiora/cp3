public class ComputerFileTest {
    public static void main(String[] args) {
        // Create a new file
        ComputerFile file = new ComputerFile("example", 120, "read/write", "2024-11-26 09:00:00", "txt");

        // Display file details
        file.displayDetails();

        // Open the file
        file.open();

        // Edit the file
        file.edit("Adding new content...");

        // Save the file
        file.save();

        // Display updated details
        file.displayDetails();

        // Copy the file
        ComputerFile copiedFile = file.copy("example_copy");
        copiedFile.displayDetails();

        // Delete the original file
        file.delete();

        // Display the details of the deleted file
        file.displayDetails();
    }
}
