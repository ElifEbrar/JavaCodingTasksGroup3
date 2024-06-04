package Akif.week1;

public class FINRA {
    public static void main(String[] args) {
        int num = 30;
        int start = 1;
        do {
            if (start % 15 == 0) {
                System.out.print("FINRA ");
            } else if (start % 5 == 0) {
                System.out.print("RA ");
            } else if (start % 3 == 0) {
                System.out.print("FIN ");
            } else {
                System.out.print(start + " ");
            }
            start++;
        } while (start <= num);
    }
}
