import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a character array from the string
        char[] charArray = inputString.toCharArray();

        // Output the character array
        System.out.println("Character array contents:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
