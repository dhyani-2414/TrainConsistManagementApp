import java.util.*;

/**
 * Train Consist Management App - UC2
 * Demonstrates ArrayList operations (Add, Remove, Contains)
 * for managing passenger bogies.
 *
 * @author Jevin
 * @version 1.0
 */
public class TrainConsistAppUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies (CREATE operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion (READ operation)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE operation)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence (SEARCH operation)
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + exists);

        // Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}