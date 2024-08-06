package Akif.week6;

public class MaxFinder {

    public static void main(String[] args) {
    int[] arr = {99, 12, 23, 32, 44, 57, 6};
    System.out.println("The maximum number is: " + findMax(arr));
}

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


}
/*Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99*/
