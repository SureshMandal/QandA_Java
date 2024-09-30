import java.util.Scanner;

public class UnicodeCodePointCount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user for the start and end indices
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Validate indices
        if (startIndex < 0 || endIndex > inputString.length() || startIndex > endIndex) {
            System.out.println("Invalid indices. Please ensure they are within the string length and start index is less than or equal to end index.");
        } else {
            // Count the number of Unicode code points in the specified range
            int codePointCount = inputString.codePointCount(startIndex, endIndex);

            // Output the result
            System.out.println("Number of Unicode code points in the specified range: " + codePointCount);
        }

        // Close the scanner
        scanner.close();
    }
}
