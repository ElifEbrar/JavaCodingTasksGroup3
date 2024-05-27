package BilalK.week1;



public class OddOrEven {
    public static void main(String[] args) {

        int num1= 5;
        int num2= 6;

        oddOrEven(num1);
        oddOrEven(num2);


}

public static void oddOrEven(int num) {

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