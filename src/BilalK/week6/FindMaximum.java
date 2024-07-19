package BilalK.week6;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("The maximum number is: " + findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
        }
        return max;
    }
}
