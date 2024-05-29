package BilalK.week1;

public class DivideTwoNums {

    public static void main(String[] args) {

    int a= 45;
    int b= 5;

    divideMethod(a, b);

    }
public static void divideMethod(int a, int b) {

  System.out.println(Math.floorDiv(a,b));
}

}

/*
Write a method that can divide two numbers without using division operator
 */
/*
           int dividend = 20;
        int divisor = 4;

        System.out.println("Result: " + divide(dividend, divisor));
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero!");
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return sign * quotient;
    }
 */