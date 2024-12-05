package c;

import java.util.ArrayList;

public class c3 {
    public static int numUniqueLimited(ArrayList<Integer> list) {
        boolean[] seen = new boolean[201];
        int uniqueCount = 0;
        for (int i : list) { 
            int index = i + 100;
            if (!seen[index]) { // remember that a boolean array starts off as all false when initialized this checks if seen[index] is false (nothing inside) so then will turn it to true and run the rust of the code
                seen[index] = true;
                uniqueCount++;

            }
        }
        return uniqueCount; 
    }
}
