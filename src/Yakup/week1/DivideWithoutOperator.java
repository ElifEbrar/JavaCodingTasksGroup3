package Yakup.week1;
/*
Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
 */

public class DivideWithoutOperator {

    public static void main(String[] args) {

        int n1 = 1000;
        int n2 = 20;

        divideWithoutOperator(n1, n2);

    }

    public static void divideWithoutOperator(int n1, int n2) {

        int sum = 0;
        int count = 0;
        int remainder = 0;

        if(sum <= n1) {

            while (sum <= n1 - n2) {

                sum = sum + n2;
                count++;
                //System.out.println("DEBUG : " + count + " --> Sum = " + sum);

            }
            remainder = n1 % sum;
        }

        System.out.println(Support.YELLOW + "Result --> " + n1 + " / " + n2 + " =  " + count + "\n" + "Remainder --> " + remainder +Support.RESET);
    }
}
