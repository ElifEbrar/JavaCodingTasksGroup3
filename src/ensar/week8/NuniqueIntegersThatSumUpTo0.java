package ensar.week8;

import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {

    public static void main(String[] args) {
        int givenInt = 5;

        System.out.println(Arrays.toString(nUniqueArraySumsZero(givenInt)));
    }

    private static int[] nUniqueArraySumsZero(int givenInt) {
        int[] result = new int[givenInt];
        
            for (int i = 0; i < givenInt / 2; i++) {
                result[i] = Integer.parseInt("-" + (i+1));
                result[(givenInt - 1) - i] = i+1;
            }
        
        return result;
    }

}
