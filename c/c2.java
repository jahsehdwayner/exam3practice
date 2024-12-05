package c;

import java.util.ArrayList;
import java.util.Collections;

public class c2 {
    public static int numUniqueSort(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        Collections.sort(arr);
        int count = 1;
        int current = arr.get(0);
        for (int i = 1; i < arr.size(); i++) { // loop through the array
            if (arr.get(i) != current) { // if the current number does not equal the past number
                count++;
                current = arr.get(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test case 1
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 2, 7, 2, 10, 7);
        System.out.println("Number of unique values: " + numUniqueSort(list1)); // Expected: 3

        // Test case 2
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 1, 1, 1, 1);
        System.out.println("Number of unique values: " + numUniqueSort(list2)); // Expected: 1

        // Test case 3
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println("Number of unique values: " + numUniqueSort(list3)); // Expected: 0

    
}   }