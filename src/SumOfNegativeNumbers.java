public class SumOfNegativeNumbers {
    public static void main(String[] args) {
        // Define an array with some positive and negative numbers
        int[] array = {12, -7, 9, -3, 15, -5, 8, -10};

        // Initialize a variable to store the sum of negative numbers
        int sum = 0;

        // Iterate through the array and add the negative numbers to the sum
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {  // Check if the number is negative
                sum += array[i];
            }
        }

        // Output the sum of negative numbers
        System.out.println("Sum of negative numbers in the array: " + sum);
    }
}
