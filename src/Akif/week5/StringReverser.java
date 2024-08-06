package Akif.week5;

public class StringReverser {
    public static void main(String[] args) {
        String original = "ABCD";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
    public static String reverse(String input) {
        if (input == null) {
            return null; // Handle null input
        }

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed;
    }


}