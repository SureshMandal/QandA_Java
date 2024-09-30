public class MergeArrays {
    public static void main(String[] args) {
        // Define the first array
        int[] array1 = {1, 2, 3, 4, 5};
        // Define the second array
        int[] array2 = {6, 7, 8, 9, 10};

        // Create a third array to hold the merged result
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array to the merged array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array to the merged array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Output the merged array
        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
