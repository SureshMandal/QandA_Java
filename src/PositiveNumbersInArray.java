public class PositiveNumbersInArray {
    public static void main(String[] args) {
        // Define an array with both positive and negative numbers
        int[] array = {-12, 7, 9, -3, 15, -5, 8, -10};

        System.out.print("Positive numbers in the array: ");

        // Iterate through the array and check if each number is positive
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {  // Check if the number is positive
                System.out.print(array[i] + " ");
            }
        }
    }
}
