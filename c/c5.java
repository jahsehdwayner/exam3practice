package c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c5 {
    public static boolean contains3(List<String> set) {
        Map<String, Integer> count = new HashMap<String, Integer>(); // create a hash map remember that these have a "key" then teh "result" in this case the string is the key
        /*
         * Lets use a enhanced loop to iterate through the whole set, put down eah string along with the integer 1. if we already seen teh string and its 
         * already inside, then +1 this is how we will get hte count
         */

         for (String element : set) {
            if (count.containsKey(element)) {
                count.put(element, count.get(element) + 1); // replaces the old key with teh same key but the same element just added to one
                if (count.get(element) == 3) {
                    return true;
                }
            } else {
                count.put(element, 1);
            }
         }
         return false;
    }

    public static void main(String[] args) {
        // Test case 1: List with a string occurring 3 times
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("apple");
        list1.add("cherry");
        list1.add("apple");
        System.out.println("Contains a string at least 3 times: " + contains3(list1)); // Expected: true

        // Test case 2: List with no string occurring 3 times
        List<String> list2 = new ArrayList<>();
        list2.add("dog");
        list2.add("cat");
        list2.add("bird");
        System.out.println("Contains a string at least 3 times: " + contains3(list2)); // Expected: false

        // Test case 3: Empty list
        List<String> list3 = new ArrayList<>();
        System.out.println("Contains a string at least 3 times: " + contains3(list3)); // Expected: false

        // Test case 4: List with multiple strings occurring exactly 3 times
        List<String> list4 = new ArrayList<>();
        list4.add("x");
        list4.add("x");
        list4.add("x");
        list4.add("y");
        list4.add("y");
        list4.add("y");
        list4.add("z");
        System.out.println("Contains a string at least 3 times: " + contains3(list4)); // Expected: true
    }
}
