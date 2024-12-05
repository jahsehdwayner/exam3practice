package s;

public class s2 {
    public static int lengthOfLongestSorted(int[] array) {
        if (array.length == 0) {
            return 0; // Handle empty array case
        }
        int maxCount = 1; // Maximum length of a sorted sequence
        int currentCount = 1; // Current length of the sorted sequence
    
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                currentCount++; // Continue the sorted sequence
                maxCount = Math.max(maxCount, currentCount); // Update max length
            } else {
                currentCount = 1; // Reset the count when the sequence breaks
            }
        }             
        return maxCount;
    }
    


        public static void main(String[] args) {
            // Test cases
            int[] testArray1 = {1, 2, 3, 2, 4, 5, 6}; // Longest sorted: 3, 2, 4, 5, 6
            int[] testArray2 = {10, 9, 8, 7};         // No sorted sequence greater than 1
            int[] testArray3 = {5, 5, 5, 5};          // Longest sorted: Entire array
            int[] testArray4 = {};                    // Empty array
    
            // Call the method and print results
            System.out.println("Test Array 1: " + lengthOfLongestSorted(testArray1)); // Expected: 4
            System.out.println("Test Array 2: " + lengthOfLongestSorted(testArray2)); // Expected: 1
            System.out.println("Test Array 3: " + lengthOfLongestSorted(testArray3)); // Expected: 4
            System.out.println("Test Array 4: " + lengthOfLongestSorted(testArray4)); // Expected: 0
        }
    } 

