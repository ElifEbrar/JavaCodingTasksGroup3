package ensar.week5;

public class StringReverse {

    public static void main(String[] args) {
        String givenString = "ABCD";

        System.out.println(Reverse(givenString));
    }

    private static String Reverse(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

}
