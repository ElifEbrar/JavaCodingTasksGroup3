package BilalO.Week3;
public class ReverseNegativeNumber {

    // Method to reverse the digits of a negative number
    public static int reverseNegativeNumber(int number) {
        // Check if the number is negative
        if (number >= 0) {
            throw new IllegalArgumentException("The number must be negative.");
        }

        // Convert the negative number to a positive one for easier manipulation
        int positiveNumber = -number;
        int reversedNumber = 0;

        // Reverse the digits
        while (positiveNumber > 0) {
            int digit = positiveNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            positiveNumber /= 10;
        }

        // Convert it back to a negative number
        return -reversedNumber;
    }

    public static void main(String[] args) {
        // Test the method with different negative numbers
        int number1 = -35;
        int number2 = -1234;
        int number3 = -56789;

        System.out.println("Reversed " + number1 + " is: " + reverseNegativeNumber(number1));
        System.out.println("Reversed " + number2 + " is: " + reverseNegativeNumber(number2));
        System.out.println("Reversed " + number3 + " is: " + reverseNegativeNumber(number3));
    }
}

