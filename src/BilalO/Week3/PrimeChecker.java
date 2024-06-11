package BilalO.Week3;
public class PrimeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        // Check for factors from 3 to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test the method with different numbers
        int[] testNumbers = {1, 2, 3, 4, 5, 16, 17, 18, 19, 20};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " prime? " + isPrime(number));
        }
    }
}

