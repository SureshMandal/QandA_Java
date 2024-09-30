public class UniqueElementsInArray {
    public static void main(String[] args) {
        // Define an array with some duplicate and unique elements
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};

        System.out.print("Unique elements in the array: ");

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            // Check if the current element has a duplicate in the array
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break; // No need to check further if a duplicate is found
                }
            }

            // If the element is unique, print it
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
