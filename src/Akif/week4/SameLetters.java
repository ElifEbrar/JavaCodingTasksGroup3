package Akif.week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        // Test cases
        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false
    }

    public static boolean same(String str1, String str2) {
        // If lengths of the strings are different, they can't be made up of the same letters
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
