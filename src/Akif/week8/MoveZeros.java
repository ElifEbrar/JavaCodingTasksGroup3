package Akif.week8;

import java.util.Arrays;

public class MoveZeros {
        public static void main(String[] args) {
            int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
            moveZerosToEnd(arr);
            System.out.println(Arrays.toString(arr));
        }

        public static void moveZerosToEnd(int[] arr) {
            int index = 0; // Pointer for non-zero elements

            // Move all non-zero elements to the front
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[index++] = arr[i];
                }
            }

            // Fill the remaining positions with zeros
            while (index < arr.length) {
                arr[index++] = 0;
            }
        }


    }


