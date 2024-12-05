package c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c6 {
    public static int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();// first step create the map with integers on both sides. so we can see which integer is the most 
        for (int num : list) {
            if(count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        int greatest = 0;

        for (int number : count.keySet()) {
            if (count.get(number) > greatest) {
                greatest = count.get(number);
            }
        }

        return greatest;
    }


     public static void main(String[] args) {
        // Test case 1: List with a clear mode
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        System.out.println("Max occurrences: " + maxOccurrences(list1)); // Expected: 3

        // Test case 2: List with all elements occurring once
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println("Max occurrences: " + maxOccurrences(list2)); // Expected: 1

        // Test case 3: Empty list
        List<Integer> list3 = new ArrayList<>();
        System.out.println("Max occurrences: " + maxOccurrences(list3)); // Expected: 0

        // Test case 4: List with multiple modes
        List<Integer> list4 = new ArrayList<>();
        list4.add(7);
        list4.add(8);
        list4.add(8);
        list4.add(7);
        list4.add(9);
        System.out.println("Max occurrences: " + maxOccurrences(list4)); // Expected: 2
    }
}
