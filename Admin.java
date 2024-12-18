import java.io.IOException;
import java.time.LocalDate;

public class Admin extends User {
    // Default constructor
    public Admin() {
        super(); // Call User's default constructor
    }

    // Parameterized constructor
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day); // Call User's parameterized constructor
    }

    // Override the displayInfo() method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the User's displayInfo method
        System.out.println("User type: admin.");
    }

    // Overloaded displayInfo method
    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + getName());
            System.out.println("Birthday: " + getDob());
            System.out.println("User type: admin.");
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + getName());
        }
    }

    // Main method for testing
    public static void main(String[] args) throws IOException {
        // Create an instance of Admin
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo(); // Basic displayInfo
        nicolas.displayInfo(true);  // Full displayInfo
        nicolas.displayInfo(false); // Only name
    }
}