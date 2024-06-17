package ensar.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String givenString = "AAABBBCCC";

        System.out.println(removeDuplicates(givenString));

    }

    private static String removeDuplicates(String str) {

        StringBuilder sb = new StringBuilder();
        char lastChar = str.charAt(0);
        sb.append(lastChar);

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != lastChar) {
                sb.append(currentChar);
                lastChar = currentChar;
            }
        }

        return sb.toString();
    }

}
