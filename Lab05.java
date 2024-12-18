import java.io.IOException;
import java.time.LocalDate;


public static void main(String[] args) throws IOException {
     // Create an instance of User
     User john = new User("John", 1954, 2, 18);
     john.displayInfo(); // Display user's info
    // Create an instance of Admin
    Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
    nicolas.displayInfo(); // Basic displayInfo
    nicolas.displayInfo(true);  // Full displayInfo
    nicolas.displayInfo(false); // Only name
}