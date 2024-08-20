package Akif.week6;

import java.util.regex.*;//java.util.regex.*: This imports the classes needed to work with regular expressions in Java. Specifically, we'll use Pattern and Matcher.


public class DigitSum {
    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        System.out.println("The sum of the digits is: " + sumOfDigits(input));  // Output should be 20
    }
    public static int sumOfDigits(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        int sum = 0;

        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
    }


}


