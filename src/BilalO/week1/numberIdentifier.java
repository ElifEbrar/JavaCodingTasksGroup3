package BilalO.week1;

public class numberIdentifier {


/* Numbers-  Odd or even:**
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"*
*/
public static class NumberIdentifier {

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }


        }

    public static void main(String[] args) {
        System.out.println(identify(5)); // "Odd"
        System.out.println(identify(6)); // "Even"
    }

    }

   
}


