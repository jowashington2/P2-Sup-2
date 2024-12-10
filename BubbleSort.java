public class SortingAlgorithms {

    /**
     * Sorts an array of integers using the BubbleSort algorithm.
     * @param array The array of integers to sort.
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            n--; // Reduce the effective size of the array
        } while (swapped);
    }
}
