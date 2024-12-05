public class g3 {
    public static <T extends Comparable<T>> T largest(T[] array) {
        T greatest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo (greatest) > 0) {
                greatest = array[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {2, 7, 10, 1, 8};
        System.out.println("Largest Integer: " + largest(intArray)); // Output: 10
    
        // Test with String array
        String[] strArray = {"he", "she", "it", "us", "them"};
        System.out.println("Largest String: " + largest(strArray)); // Output: "us"
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
