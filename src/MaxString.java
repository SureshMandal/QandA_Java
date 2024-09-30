import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user for the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Find the maximum string
        String maxString;
        if (firstString.compareTo(secondString) > 0) {
            maxString = firstString;
        } else if (firstString.compareTo(secondString) < 0) {
            maxString = secondString;
        } else {
            maxString = "Both strings are equal.";
        }

        // Output the result
        System.out.println("Maximum string: " + maxString);

        // Close the scanner
        scanner.close();
    }
}
