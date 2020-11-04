package art.aukhatov.algorithms.sorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntQuickSortTest {

    @Test
    public void sort() {
        int[] unsorted = new int[]{89, 35, 100, 77, 9, 5, 3, 5, 6, 1, 2, 32, 46, 0};
        int[] expected = new int[]{0, 1, 2, 3, 5, 5, 6, 9, 32, 35, 46, 77, 89, 100};

        int[] sorted = IntQuickSort.sort(unsorted);

        assertArrayEquals(expected, sorted);
    }
}