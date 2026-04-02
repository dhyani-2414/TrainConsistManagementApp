import java.util.*;

/**
 * Train Consist Management App - UC5
 * Demonstrates LinkedHashSet to maintain insertion order + uniqueness.
 *
 * @author Jevin
 * @version 1.0
 */
public class TrainConsistAppUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for ordered & unique bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (in order)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal bogies: " + trainFormation.size());

        System.out.println("\nProgram continues...");
    }
}