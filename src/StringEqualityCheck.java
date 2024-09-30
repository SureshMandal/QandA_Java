import java.util.Scanner;

public class StringEqualityCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user for the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Check if both strings are equal
        boolean areEqual = firstString.equals(secondString);

        // Output the result
        if (areEqual) {
            System.out.println("The two strings contain the same data.");
        } else {
            System.out.println("The two strings do not contain the same data.");
        }

        // Close the scanner
        scanner.close();
    }
}
