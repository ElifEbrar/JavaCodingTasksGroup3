package Yakup.week1;
/*
FINRA:
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class FINRA {

    public static void main(String[] args) {
        int numbers = 30;

        finra(numbers);
    }

    public static void finra(int numbers){

        for (int i = 1; i <= numbers; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(Support.BLUE + "FINRA" + Support.RESET);
            } else if (i % 5 == 0) {
                System.out.println(Support.YELLOW + "RA" + Support.RESET);
            } else if (i % 3 == 0 ) {
                System.out.println(Support.DARKRED + "FIN" + Support.RESET);
            }else {
                System.out.println(i);
            }
        }
    }
}
