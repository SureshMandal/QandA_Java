import java.util.Scanner;

public class StringEndsWithExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user for the suffix string
        System.out.print("Enter the suffix string: ");
        String suffixString = scanner.nextLine();

        // Check if the main string ends with the suffix string
        boolean endsWith = mainString.endsWith(suffixString);

        // Output the result
        if (endsWith) {
            System.out.println("The main string ends with the suffix string.");
        } else {
            System.out.println("The main string does not end with the suffix string.");
        }

        // Close the scanner
        scanner.close();
    }
}
