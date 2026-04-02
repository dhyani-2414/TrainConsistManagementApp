import java.util.*;

/**
 * Train Consist Management App - UC1
 * Initializes train consist and displays initial summary.
 *
 * @author Jevin
 * @version 1.0
 */
public class TrainConsistAppUC1 {

    /**
     * Main method - Entry point of application
     */
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready for further operations.");
    }
}