package Akif.week8;

import java.util.Arrays;

public class SumToZero {public static void main(String[] args) {
    // Example: N = 4
    System.out.println(Arrays.toString(sumZero(4)));  // Output example: [1, -1, 2, -2]

    // Example: N = 5
    System.out.println(Arrays.toString(sumZero(5)));  // Output example: [1, -1, 2, -2, 0]
}
public static int[] sumZero(int N) {

    int[] result = new int[N];
    int index = 0;

    // Generate pairs of numbers that sum to 0
    for (int i = 1; i <= N / 2; i++) {
        result[index++] = i;   // Add positive number
        result[index++] = -i;  // Add negative number
    }

    // If N is odd, include 0
    if (N % 2 != 0) {
        result[index] = 0;
    }

    return result;
}/*
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers)*/
}