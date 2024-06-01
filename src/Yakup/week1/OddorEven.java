package Yakup.week1;

/*
Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */

public class OddorEven {


    public static void main(String[] args) {


        int number = 1190;
        oddorEven(number);

    }

    public static void oddorEven(int n) {

        if (n % 2 == 0) {
            System.out.println(Support.BLUE + n + Support.RESET + Support.YELLOW + " is an EVEN number" + Support.RESET);
        }else{
            System.out.println(Support.CYAN + n + Support.RESET + Support.YELLOW + " is an ODD number" + Support.RESET);
        }

    }
}
