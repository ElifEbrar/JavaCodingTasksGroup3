package Akif.week7;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
