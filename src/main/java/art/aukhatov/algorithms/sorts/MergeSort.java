package art.aukhatov.algorithms.sorts;

public class MergeSort {

	private MergeSort() {
		throw new UnsupportedOperationException("Only static usage");
	}

	public static int[] sort(int[] array) {
		splitAndSort(array, 0, array.length - 1);
		return array;
	}

	private static void splitAndSort(int[] array, int left, int right) {
		// while can be split
		if (left < right) {
			int mid = left + (right - left) / 2;

			// sort left side
			splitAndSort(array, left, mid);

			// sort right side
			splitAndSort(array, mid + 1, right);

			sortAndMerge(array, left, mid, right);
		}
	}

	private static void sortAndMerge(int[] array, int left, int mid, int right) {
		int length = (right - left) + 1;
		int[] sortedArray = new int[length];
		int leftIndex = left;
		int rightIndex = mid + 1;
		int i = 0;

		while (leftIndex <= mid && rightIndex <= right) {
			if (array[leftIndex] <= (array[rightIndex])) {
				// left element is less than right
				sortedArray[i++] = array[leftIndex++];
			} else {
				// right element is less than left
				sortedArray[i++] = array[rightIndex++];
			}
		}

		while (leftIndex <= mid) {
			// copy the rest of the array on left side
			sortedArray[i++] = array[leftIndex++];
		}

		while (rightIndex <= right) {
			// copy the rest of the array on right side
			sortedArray[i++] = array[rightIndex++];
		}

		// merge
		System.arraycopy(sortedArray, 0, array, left, length);
	}
}
