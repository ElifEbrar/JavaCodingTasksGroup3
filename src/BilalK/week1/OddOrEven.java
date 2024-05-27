package BilalK.week1;

import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {

        int num1= 10;
        int num2= 12;

        OddOrEven(num1);
        OddOrEven(num2);


}

public static void OddOrEven(int num) {

    if(num%2==0){
        System.out.println("identify(" + num+");->" + "Even");
    } else{
        System.out.println("identify(" + num+");->" + "Odd");
    }
}
}

/*
 Numbers-  Odd or even:
Write  a method which can identify given number is even or odd

Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */