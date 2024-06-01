package BilalO.week1;

//Write a method that can divide two numbers without using division operator

public class withoutDivisionOperator {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));  // 5
        System.out.println(divide(7, -3));  // -2
        System.out.println(divide(-15, 3)); // -5
        System.out.println(divide(-8, -2)); // 4
    }
}
