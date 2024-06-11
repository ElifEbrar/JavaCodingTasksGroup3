package Akif.week3;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(7)); // true
        System.out.println(isPrime(9)); // false
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        // Check divisibility from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }/*Prime numbers are natural numbers that are divisible by only 1 and the number itself

   Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not
    */

}
