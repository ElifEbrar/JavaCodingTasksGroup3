package ensar.week8;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {
        int[] input = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveZeros(input)));
    }
    
    private static int[] moveZeros(int[] intArr) {
        int[] result = new int[intArr.length];
        int resultIndex = 0;
        
        for (int i = 0; i < intArr.length; i++) {
            
            if(intArr[i] != 0) {
                result[resultIndex] = intArr[i];
                resultIndex++;
            }
        }
        
        return result;
    }
    
}
