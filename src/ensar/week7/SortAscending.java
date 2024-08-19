package ensar.week7;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(Sort(arr)));
    }

    private static int[] Sort(int[] intArr) {

        for (int i = 0; i < intArr.length - 1; i++) {
            
            for (int j = 0; j < intArr.length - 1 - i; j++) {
                
                if (intArr[j] > intArr[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }

        return intArr;
    }

}
