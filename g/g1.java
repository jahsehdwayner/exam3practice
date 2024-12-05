public class g1 {
    public static <T> void arrayPrinter(T[] Array) {
        System.out.print("[");

        if (Array.length > 0) {
            System.out.print(Array[0]);
        }

        for(int i =1; i < Array.length;i++) {
            System.out.print(", " + Array[i]);
        }

        System.out.print("]");
    }

    public static void main(String[] args) {
        // Test with an Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        arrayPrinter(intArray);

        // Test with a String array
        String[] stringArray = {"Hello", "World", "Generics"};
        arrayPrinter(stringArray);

        // Test with a Character array
        Character[] charArray = {'A', 'B', 'C', 'D'};
        arrayPrinter(charArray);
    }

}