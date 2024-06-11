package BilalO.Week2;

public class ConsecutiveNumbers {


    public static void main(String[] args) {

        int givenPositiveInteger = 15;

        method(givenPositiveInteger);

    }

    static void method(int N) {

        for (int i = 1; i < N+1; i++) {

            StringBuilder result = new StringBuilder();

            if (i % 2 == 0){
                result.append("Codility");
            }

            if (i % 3 == 0){
                result.append("Test");
            }

            if (i % 5 == 0){
                result.append("Coders");
            }

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                result.append(i);
            }

            System.out.println(result);

        }

    }
}
