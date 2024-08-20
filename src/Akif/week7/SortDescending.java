package Akif.week7;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = sortDescending(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortDescending(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted
            if (!swapped) break;
        }
        return array;
    }/*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
}
