package Akif.week1;public class DivideWithoutOperator {
    public static void main(String[] args) {


        System.out.println(divide(20, 3));


    }

    static int divide(int a, int b) {
        int sign = 1;
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            sign = -1;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int quotient = 0;
        while (a >= b) {
            a -= b;
            quotient++;
        }
        return sign * quotient;
    }
}