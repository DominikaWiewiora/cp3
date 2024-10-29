import java.util.Random; // Importing Random class for random number generation
import java.util.Scanner; // Importing Scanner class for user input

public class StudentGrades {
    private String studentName; // Student's name
    private double[] grades; // Array to store the grades

    // Constructor to initialize student's name and grades
    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    // Constructor to create random grades
    public StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        this.grades = new double[numberOfGrades]; // Initialize the grades array
        Random random = new Random(); // Create a Random object
        for (int i = 0; i < numberOfGrades; i++) {
            grades[i] = 2.0 + (random.nextDouble() * 3.0); // Random grades between 2.0 and 5.0
        }
    }

    // Constructor to input grades from the keyboard
    public StudentGrades(String name) {
        this.studentName = name;
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter the number of grades for " + studentName + ": ");
        int numberOfGrades = scanner.nextInt(); // Read the number of grades
        this.grades = new double[numberOfGrades]; // Initialize the grades array
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble(); // Read each grade
        }
    }

    // Method to calculate the lowest grade
    public double calculateLowestGrade() {
        double lowest = grades[0]; // Start with the first grade
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade; // Update lowest if a lower grade is found
            }
        }
        return lowest;
    }

    // Method to calculate the highest grade
    public double calculateHighestGrade() {
        double highest = grades[0]; // Start with the first grade
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade; // Update highest if a higher grade is found
            }
        }
        return highest;
    }

    // Method to calculate the number of grades
    public int calculateNumberOfGrades() {
        return grades.length; // Return the length of the grades array
    }

    // Method to calculate the grade point average (GPA)
    public double calculateGPA() {
        double total = 0;
        for (double grade : grades) {
            total += grade; // Sum all grades
        }
        return total / calculateNumberOfGrades(); // Return the average
    }

    // Method to display the student's record
    public void displayRecord() {
        System.out.println("Student Name: " + studentName);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " "); // Print each grade
        }
        System.out.println();
        System.out.println("Number of Grades: " + calculateNumberOfGrades());
        System.out.println("Lowest Grade: " + calculateLowestGrade());
        System.out.println("Highest Grade: " + calculateHighestGrade());
        System.out.println("Grade Point Average: " + calculateGPA());
        System.out.println(); // Blank line for readability
    }

    // Main method to test the StudentGrades class
    public static void main(String[] args) {
        // Create grades for two students using random grades
        StudentGrades randomStudent = new StudentGrades("Random Student", 5);
        randomStudent.displayRecord(); // Display random student's record

        // Create grades for another student by inputting from keyboard
        StudentGrades inputStudent = new StudentGrades("Input Student");
        inputStudent.displayRecord(); // Display input student's record
    }
}
