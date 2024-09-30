public class SumOfArrayElements {
    public static void main(String[] args) {
        // Define an array with some elements
        int[] array = {5, 10, 15, 20, 25};

        // Variable to store the sum of elements
        int sum = 0;

        // Iterate through the array and calculate the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Output the sum of array elements
        System.out.println("Sum of array elements: " + sum);
    }
}
