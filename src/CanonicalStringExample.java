public class CanonicalStringExample {
    public static void main(String[] args) {
        // Create a string object
        String str1 = new String("Hello, World!");

        // Get the canonical representation using intern()
        String canonicalStr = str1.intern();

        // Print both the original and canonical representations
        System.out.println("Original String: " + str1);
        System.out.println("Canonical String: " + canonicalStr);

        // Check if both references point to the same object
        System.out.println("Are both strings equal? " + (str1 == canonicalStr));
    }
}
