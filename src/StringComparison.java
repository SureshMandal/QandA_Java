import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user for a character sequence
        System.out.print("Enter a character sequence: ");
        CharSequence charSequence = scanner.nextLine();

        // Compare the input string to the specified character sequence
        boolean isEqual = inputString.contentEquals(charSequence);

        // Output the result
        if (isEqual) {
            System.out.println("The string is equal to the specified character sequence.");
        } else {
            System.out.println("The string is not equal to the specified character sequence.");
        }

        // Close the scanner
        scanner.close();
    }
}
