package Akif.week5;

public class UniqueCharacters {
    public static void main(String[] args) {
        String result = unique("AAABBBCCCDEF");
        System.out.println(result);  // Output: "DEF"
    }
    public static String unique(String s) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if character's first and last occurrence are the same
            /* String s = "AAABBBCCCDEF";
            int firstIndex = s.indexOf('A'); // 0
            int lastIndex = s.lastIndexOf('A'); // 2
            */
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                uniqueChars.append(c);
            }
        }

        return uniqueChars.toString();
    }


}