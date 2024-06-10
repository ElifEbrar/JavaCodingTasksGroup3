package Yakup.week3;

import Yakup.week1.Support;

import java.util.Scanner;

/*
 📌 **__Java Coding Tasks - Week3__**📌

   2️⃣ **Numbers -- Reverse Negative Number**
    ```Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53

 */
public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int number = -35;

        System.out.println(Support.YELLOW + "Reversed Negative Number = " + Support.RESET + reverseNegativeNumber(number));
    }

    public static int reverseNegativeNumber(int number) {

        if (number < 0) {
            int firstStep = number % 10;
            int secondStep = (number - firstStep) / 10;
            int reversedNumber = firstStep * 10 + secondStep;
            return reversedNumber;

        } else {
            return number;
        }
    }
}
