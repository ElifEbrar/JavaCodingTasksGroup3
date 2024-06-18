package BilalK.week4;

import java.util.Arrays;

public class SameLetters {
    /*
    2️⃣  String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
     */
    public static void main(String[] args) {
        String str1 ="abc";
        String str2 ="cab";

        System.out.println("same(str1, str2) = " + same(str1, str2));

    }

    public static boolean same(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        return Arrays.equals(str1Chars, str2Chars);
    }

}
