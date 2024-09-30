import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user for the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings using the + operator
        String concatenatedUsingOperator = firstString + secondString;

        // Concatenate the strings using the concat() method
        String concatenatedUsingMethod = firstString.concat(secondString);

        // Output the results
        System.out.println("Concatenated using + operator: " + concatenatedUsingOperator);
        System.out.println("Concatenated using concat() method: " + concatenatedUsingMethod);

        // Close the scanner
        scanner.close();
    }
}
