package s;

public class s1 {
    public static boolean isSorted(int[] array) {
        for(int i = 1; i <  array.length;i++ ) {
            if (array[i-1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test case 1: Sorted array
        int[] sortedArray = {1, 2, 3, 4, 5};
        System.out.println("Is sorted: " + isSorted(sortedArray)); // Expected: true

        // Test case 2: Unsorted array
        int[] unsortedArray = {5, 3, 1, 4, 2};
        System.out.println("Is sorted: " + isSorted(unsortedArray)); // Expected: false

        // Test case 3: Empty array
        int[] emptyArray = {};
        System.out.println("Is sorted: " + isSorted(emptyArray)); // Expected: true

        // Test case 4: Single-element array
        int[] singleElementArray = {42};
        System.out.println("Is sorted: " + isSorted(singleElementArray)); // Expected: true

        // Test case 5: Array with duplicates but sorted
        int[] duplicatesArray = {1, 2, 2, 3, 3, 4};
        System.out.println("Is sorted: " + isSorted(duplicatesArray)); // Expected: true

        // Test case 6: Array with one unsorted element
        int[] almostSortedArray = {1, 2, 5, 4, 6};
        System.out.println("Is sorted: " + isSorted(almostSortedArray)); // Expected: false
    }
}
