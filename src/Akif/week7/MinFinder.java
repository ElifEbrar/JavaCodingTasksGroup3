package Akif.week7;

public class MinFinder {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("The minimum number is: " + findMin(arr));
    }
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}/*Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6*/
