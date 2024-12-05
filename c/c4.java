package c;

import java.util.HashSet;
import java.util.Set;

public class c4 {
    public static int maxLength(Set<String> set) {
        
        String largest = "";
        for (String element: set) {
            if (element.length() > largest.length()) {
                largest = element;
            }
        }
        return largest.length();
    }


    public static void main(String[] args) {
        // Test case 1: Normal set of strings
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        System.out.println("Longest string length: " + maxLength(set1)); // Expected: 6 ("banana")

        // Test case 2: Set with one string
        Set<String> set2 = new HashSet<>();
        set2.add("pineapple");
        System.out.println("Longest string length: " + maxLength(set2)); // Expected: 9 ("pineapple")

        // Test case 3: Empty set
        Set<String> set3 = new HashSet<>();
        System.out.println("Longest string length: " + maxLength(set3)); // Expected: 0

        // Test case 4: Set with strings of equal length
        Set<String> set4 = new HashSet<>();
        set4.add("dog");
        set4.add("cat");
        set4.add("bat");
        System.out.println("Longest string length: " + maxLength(set4)); // Expected: 3
    }
}
