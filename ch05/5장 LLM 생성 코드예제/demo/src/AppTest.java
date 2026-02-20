import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testQuickSort() {
        int[] input = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        testQuickSort(input, expected);
    }

    @Test
    public void testQuickSort_emptyArray() {
        int[] input = {};
        int[] expected = {};
        testQuickSort(input, expected);
    }

    @Test
    public void testQuickSort_singleElement() {
        int[] input = {42};
        int[] expected = {42};
        testQuickSort(input, expected);
    }

    @Test
    public void testQuickSort_alreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        testQuickSort(input, expected);
    }

    @Test
    public void testQuickSort_reverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        testQuickSort(input, expected);
    }

    @Test
    public void testQuickSort_withDuplicates() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};
        testQuickSort(input, expected);
    }

    private void testQuickSort(int[] input, int[] expected) {
        int[] result = input.clone();
        App.quickSort(result, 0, result.length - 1);
        assertArrayEquals(expected, result);
    }
}
