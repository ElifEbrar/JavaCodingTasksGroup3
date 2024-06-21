package BilalK.week4;

public class FrequencyOfCharacters {
    /*
    1️⃣  String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        String str = "AAABBCDD";

        System.out.println("FrequencyOfChars(str) = " + FrequencyOfChars(str));
    }


    public static String FrequencyOfChars(String str) {

        StringBuilder result = new StringBuilder();

        while (str.length() > 0) {
            char ch = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            result.append(ch).append(count);
            str = str.replaceAll(Character.toString(ch), "");
        }
        return result.toString();
    }

}
