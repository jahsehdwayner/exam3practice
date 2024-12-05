public class g2 {
    public static <T>  void swap(T[] array, int first, int second) {
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {
        // Example 1: Integer array
        Integer[] intArray = {2, 7, 10, 1, 8};
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 0, 1); // Swapping index 0 and 1
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));

        // Example 2: String array
        String[] strArray = {"he", "she", "it", "us", "them"};
        System.out.println("\nBefore swap: " + java.util.Arrays.toString(strArray));
        swap(strArray, 1, 4); // Swapping index 1 and 4
        System.out.println("After swap: " + java.util.Arrays.toString(strArray));

        // Example 3: Double array
        Double[] doubleArray = {3.1, 4.7, 8.9};
        System.out.println("\nBefore swap: " + java.util.Arrays.toString(doubleArray));
        swap(doubleArray, 2, 0); // Swapping index 2 and 0
        System.out.println("After swap: " + java.util.Arrays.toString(doubleArray));
    }
}
