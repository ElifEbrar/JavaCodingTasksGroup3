package BilalK.week2;

public class SwapNumbers {
    /*
1️⃣ Numbers -- Swap Numbers
Swap two variable values without using a third variable
 */
    public static void main(String[] args) {

        int n1 = 3, n2 = 5;

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

    }
}
