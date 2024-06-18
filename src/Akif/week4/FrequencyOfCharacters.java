package Akif.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result = FrequencyOfChars(str);
        System.out.println(result); // Output: A3B2C1D2


    }public static String FrequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();
        int[] frequency = new int[256]; // Assuming ASCII character set

        for (char c : str.toCharArray()) {
            frequency[c]++;
        }

        for (char c : str.toCharArray()) {
            if (frequency[c] != 0) {
                result.append(c).append(frequency[c]);
                frequency[c] = 0; // Reset to 0 to avoid duplicate entries
            }
        }

        return result.toString();
    }
}
