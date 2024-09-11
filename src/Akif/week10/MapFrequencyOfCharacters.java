package Akif.week10;
import java.util.Map;
import java.util.HashMap;
public class MapFrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "hello world";
        printCharFrequency(input);

    }public static void printCharFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        freqMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}//Write a method that prints the frequency of each character from a String.
