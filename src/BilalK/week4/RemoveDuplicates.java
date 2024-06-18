package BilalK.week4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*
    3️⃣  String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println("removeDup(str) = " + removeDup(str));

    }

    public static String removeDup(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }

        return result.toString();
    }
}
