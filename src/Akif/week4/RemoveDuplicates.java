package Akif.week4;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Test cases
        System.out.println(removeDup("AAABBBCCC")); // Output: ABC
        System.out.println(removeDup("aabbcc"));    // Output: abc
        System.out.println(removeDup("abcabc"));    // Output: abc
    }

    public static String removeDup(String str) {
        //This set stores unique characters encountered, preserving the insertion order
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();//
        //It iterates through the input string and adds each character to the set. Since LinkedHashSet only allows unique elements, duplicates are automatically discarded.
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        //: It iterates through the set and appends each character to the StringBuilder, maintaining the order they were encountered in the original string.
        for (char ch : set) {
            sb.append(ch);
        }
        //After iterating through the set, the toString() method of sb is called to convert the StringBuilder object to a String containing unique characters in the original order, which is returned.
        return sb.toString();
    }
}
