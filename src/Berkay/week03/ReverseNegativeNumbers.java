package Berkay.week03;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {

        reverseNumber(-81);



    }

    public static void reverseNumber(int input){
        int reverseNumber= (input/10)+((input%10)*10);
        System.out.println("reverseNumber = " + reverseNumber);




    }
}
