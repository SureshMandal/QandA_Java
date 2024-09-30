import java.util.Scanner;

public class RepeatCharacters {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize a StringBuilder to hold the new string
        StringBuilder repeatedString = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : inputString.toCharArray()) {
            // Append the character twice
            repeatedString.append(c).append(c);
        }

        // Convert StringBuilder to String
        String result = repeatedString.toString();

        // Output the new string
        System.out.println("New string with each character repeated: " + result);

        // Close the scanner
        scanner.close();
    }
}
