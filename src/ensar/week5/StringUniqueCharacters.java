package ensar.week5;

public class StringUniqueCharacters {

    public static void main(String[] args) {
        String givenString = "AAABBBCCCDEF";

        System.out.println(unique(givenString));
    }

    private static String unique(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf((str.charAt(i)))) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

}
