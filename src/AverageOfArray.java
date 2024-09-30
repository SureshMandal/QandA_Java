public class AverageOfArray {
    public static void main(String[] args) {
        // Define an array with some elements
        int[] array = {10, 20, 30, 40, 50};

        // Variable to store the sum of elements
        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculate the average value
        double average = (double) sum / array.length;

        // Output the average value
        System.out.println("Average value of array elements: " + average);
    }
}
