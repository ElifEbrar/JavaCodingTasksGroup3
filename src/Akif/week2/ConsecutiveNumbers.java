package Akif.week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        printNumbers(100);
    }

    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String output = "";

            if (i % 2 == 0) {
                output += "Codility";
            }
            if (i % 3 == 0) {
                output += "Test";
            }
            if (i % 5 == 0) {
                output += "Coders";
            }

            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }/*
         Numbers -- print consecutive numbers
        Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
        However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
        If a number is divisible by more than one of the numbers:
        2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
        For example, numbers divisible by both 2 and 3 should be replaced by
        CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
    */
}
