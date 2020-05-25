package art.aukhatov.algorithms.sorts;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

	@Test
	public void sort() {
		int[] arr = {4, 3, 1, 0, 5, 2, 10, 45, 90, 6, 9, 8};
		int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 45, 90};

		assertArrayEquals(expectedArray, MergeSort.sort(arr));
	}
}