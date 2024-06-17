package ensar.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        String givenString1 = "abc", givenString2 = "abb";

        System.out.println(areSame(givenString1, givenString2));

    }

    private static boolean areSame(String str1, String str2) {

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

    }

}
