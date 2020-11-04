package art.aukhatov.algorithms.sorts;


public final class IntQuickSort {

    private IntQuickSort() {
        throw new UnsupportedOperationException("Just a QuickSort function for int array");
    }

    public static int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;
        swap(arr, left, mid);

        int pivot = left;
        for (int i = left + 1; i <= right; i++)
            if (arr[i] < arr[left])
                swap(arr, ++pivot, i);

        swap(arr, left, pivot);
        sort(arr, left, pivot - 1);
        sort(arr, pivot + 1, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
