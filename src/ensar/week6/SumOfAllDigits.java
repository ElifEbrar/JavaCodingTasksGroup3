package ensar.week6;

public class SumOfAllDigits {

    // GPT SOLUTION

    public static void main(String[] args) {
        String givenString = "12 java 5 apple 3";

        System.out.println(sumOfDigitsInAString(givenString));
    }

    private static int sumOfDigitsInAString(String str) {
        int sum = 0;
        String temp = "";

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Build the number as a string
                temp += ch;
            } else {
                // If we encounter a non-digit and temp is not empty, convert it to an integer and add to sum
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = ""; // Reset temp for the next number
                }
            }
        }

        // Add the last number in case the string ends with a digit
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }

}
