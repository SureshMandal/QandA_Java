public class EvenNumbersInArray {
    public static void main(String[] args) {
        // Define an array with some elements
        int[] array = {10, 23, 45, 66, 78, 91, 102, 37};

        System.out.print("Even numbers in the array: ");

        // Iterate through the array and check if each number is even
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // Check if the number is even
                System.out.print(array[i] + " ");
            }
        }
    }
}
