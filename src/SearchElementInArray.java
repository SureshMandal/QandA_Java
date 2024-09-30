import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        // Define the array
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the element to search for
        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();

        // Initialize a variable to track whether the element is found
        boolean found = false;

        // Search for the element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Element " + element + " found at index " + i);
                found = true;
                break; // Exit the loop once the element is found
            }
        }

        // If the element was not found
        if (!found) {
            System.out.println("Element " + element + " not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
