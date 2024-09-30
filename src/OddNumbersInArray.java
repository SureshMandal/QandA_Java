public class OddNumbersInArray {
    public static void main(String[] args) {
        // Define an array with some elements
        int[] array = {11, 24, 35, 48, 57, 63, 72, 89};

        System.out.print("Odd numbers in the array: ");

        // Iterate through the array and check if each number is odd
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) { // Check if the number is odd
                System.out.print(array[i] + " ");
            }
        }
    }
}
