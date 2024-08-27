package ensar.week9;

import java.util.Arrays;

public class Concat2Arrays {

    public static void main(String[] args) {

        String[] givenArray1 = {"abc", "def", "ghi"};
        String[] givenArray2 = {"jkl", "mno"};

        System.out.println(Arrays.toString(unifyArrays(givenArray1, givenArray2)));
    }

    private static String[] unifyArrays(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        int indyIndex = 0;

        for (int i = 0; i < arr1.length + arr2.length; i++) {

            if (i < arr1.length) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[indyIndex];
                indyIndex++;
            }
        }

        return result;
    }

}
