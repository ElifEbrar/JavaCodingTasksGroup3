package Akif.week6;

import java.util.regex.*;//java.util.regex.*: This imports the classes needed to work with regular expressions in Java. Specifically, we'll use Pattern and Matcher.


public class DigitSum {
    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        System.out.println("The sum of the digits is: " + sumOfDigits(input));
    }

    public static int sumOfDigits(String input) {
        Pattern pattern = Pattern.compile("\\d"); //Uses a regular expression pattern \\d to match any digit.
        Matcher matcher = pattern.matcher(input);//Finds all matches in the input string
        int sum = 0;

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
        /*matcher.find(): This method searches for the next subsequence of the input sequence that matches the pattern.
        It returns true if a match is found and false if no more matches are found.*/
    }


}
