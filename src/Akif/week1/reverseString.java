package Akif.week1;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(rvrse("hello"));

    }public static String rvrse(String input) {

        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
    } ;

}
