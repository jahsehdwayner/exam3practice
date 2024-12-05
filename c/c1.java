package c;

import java.util.HashSet;
import java.util.Set;

public class c1 {
    public static int numUniqueSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        // Test case 1
        int[] array1 = {2, 7, 2, 10, 7};
        System.out.println("Number of unique values: " + numUniqueSet(array1)); // Expected: 3
    
        // Test case 2
        int[] array2 = {1, 1, 1, 1, 1};
        System.out.println("Number of unique values: " + numUniqueSet(array2)); // Expected: 1
    
        // Test case 3
        int[] array3 = {};
        System.out.println("Number of unique values: " + numUniqueSet(array3)); // Expected: 0
    
        // Test case 4
        int[] array4 = {5, 3, 8, 3, 1, 5, 8};
        System.out.println("Number of unique values: " + numUniqueSet(array4)); // Expected: 4
    }
    
    
}
