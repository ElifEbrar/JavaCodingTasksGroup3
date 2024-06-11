package Yakup.week3;

import Yakup.week1.Support;

/*
 📌 **__Java Coding Tasks - Week3__**📌

    1️⃣ **Numbers -- PrimeNumber**
    `Write a method that can check if a number is prime or not`

 */
public class PrimeNumber {
    public static void main(String[] args) {
        int number = 250;

        primeNumber(number);
    }

    public static void primeNumber(int number) {

        // 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 49 53 ...

        for (int i = 1; i <= number; i++) {
            if (i <= 7 && i % 2 != 0) {
                System.out.print(i + " ");
            } else if (i == 2) {
                System.out.print(i + " ");
            }

            if (i > 7) {
                if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                    // System.out.println(Support.DARKRED + i + " NOT Prime Number " + Support.RESET);
                } else {
                    System.out.print(Support.YELLOW + i + " " + Support.RESET);
                }
            }
        }
        System.out.println();
    }
}

