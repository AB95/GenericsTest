public class BubbleSort {
    public static <T> T[] sort(T[] array) {
        boolean sorted;
        T[] sortedArray = array.clone();
        while (true) {
            sorted = true;
            for (int i = 1; i < sortedArray.length; i++) {
                if (((Comparable)sortedArray[i]).compareTo(sortedArray[i-1]) < 0) {
                    T temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i-1];
                    sortedArray[i-1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return sortedArray;
    }
}
