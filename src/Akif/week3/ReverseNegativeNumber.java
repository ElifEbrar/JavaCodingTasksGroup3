package Akif.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseDigits(-35)); // Output: -53
        System.out.println(reverseDigits(-123)); // Output: -321
    }

    public static int reverseDigits(int n) {
        // Determine if the number is negative
        boolean isNegative = n < 0;

        // Convert the number to a string and remove the negative sign if present
        String numStr = Integer.toString(Math.abs(n));

        // Reverse the string
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedStr);

        // Restore the negative sign if the original number was negative
        return isNegative ? -reversedNumber : reversedNumber;
    }/* Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53*/
}
