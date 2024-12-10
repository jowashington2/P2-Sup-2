import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmsTest {

    @Test
    public void testQuickSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        SortingAlgorithms.quickSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        SortingAlgorithms.mergeSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testBubbleSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        SortingAlgorithms.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testEdgeCases() {
        int[] emptyArray = {};
        int[] singleElement = {1};
        SortingAlgorithms.quickSort(emptyArray);
        SortingAlgorithms.mergeSort(singleElement);
        SortingAlgorithms.bubbleSort(singleElement);
        assertArrayEquals(emptyArray, emptyArray);
        assertArrayEquals(singleElement, singleElement);
    }
}
