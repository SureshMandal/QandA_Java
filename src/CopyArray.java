package CopyArray;

public class CopyArray {
    public static void main(String[] args) {
        // Define the source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Create a destination array of the same size
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements from sourceArray to destinationArray
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Output the destination array to verify the copy
        System.out.print("Source Array: ");
        for (int value : sourceArray) {
            System.out.print(value + " ");
        }

        System.out.print("\nDestination Array: ");
        for (int value : destinationArray) {
            System.out.print(value + " ");
        }
    }
}
