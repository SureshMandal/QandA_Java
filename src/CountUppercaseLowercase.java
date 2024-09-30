import java.util.Scanner;

public class CountUppercaseLowercase {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize counters for uppercase and lowercase letters
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        // Iterate through the string to count uppercase and lowercase letters
        for (char c : inputString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        // Output the counts
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);

        // Close the scanner
        scanner.close();
    }
}
