package Yakup.week2;

import Yakup.week1.Support;
/*
1️⃣ Numbers -- Swap Numbers
Swap two variable values without using a third variable
 */
public class SwapNumbers {
    public static void main(String[] args) {

        int numberOne = 5;
        int numberTwo = 13;

        System.out.println("numberOne = " + Support.CYAN + numberOne + Support.RESET + " numberTwo = " + Support.BLUE + numberTwo + Support.RESET);

        System.out.println("----------------------------");

        numberOne = numberOne + numberTwo;
        //              5     +     13
        numberTwo = numberOne - numberTwo;
        //  5           18    -     13
        numberOne = numberOne - numberTwo;
        //  13          18    -      5

        System.out.println("numberOne = " + Support.CYAN + numberOne + Support.RESET + " numberTwo = " + Support.BLUE + numberTwo + Support.RESET);

    }
}
