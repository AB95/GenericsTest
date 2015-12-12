public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 7, 4, 8, 3, 5, 7, 3, 2, 6, 8, 9, 3};
        printArray(intArray);
        printArray(BubbleSort.sort(intArray));

        String[] stringArray = {"a", "z", "d", "g", "d", "yu", "s"};
        printArray(stringArray);
        printArray(BubbleSort.sort(stringArray));
    }

    private static void printArray(Object[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print(array[array.length-1]);
        System.out.println("]");
    }
}
