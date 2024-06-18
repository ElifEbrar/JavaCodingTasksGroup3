package Yunus.week1;

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