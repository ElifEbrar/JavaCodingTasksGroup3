package Berkay.week02;

public class printConsecutiveNumbers {
    public static void main(String[] args) {


        connsequtivenumbers(100);


    }

    public static void connsequtivenumbers(int a) {
        for (int i = 0; i < a + 1; i++) {
            if (i % 30 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 15 == 0) {
                System.out.println("TestCoders");
            } else if (i % 10 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 6 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0) {
                System.out.println("Codility");

            } else System.out.println(i);


        }

    }
}
