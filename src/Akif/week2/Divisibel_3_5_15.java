package Akif.week2;

public class Divisibel_3_5_15 {
    public static void main(String[] args) {
        System.out.print("DivisibleBy15: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("DivisibleBy3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("DivisibleBy5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
