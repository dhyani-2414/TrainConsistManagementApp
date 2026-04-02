import java.util.*;

/**
 * Train Consist Management App - UC3
 * Demonstrates HashSet to store unique bogie IDs.
 */
public class TrainConsistAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display result
        System.out.println("\nBogie IDs (duplicates ignored):");
        System.out.println(bogieIds);

        // Display total unique count
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}