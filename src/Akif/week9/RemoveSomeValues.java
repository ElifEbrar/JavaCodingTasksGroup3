package Akif.week9;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;//Collectors is a utility class used to collect the results of a stream into various forms (like a List, Set, etc.).

public class RemoveSomeValues {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300);
        List<Integer> filtered = numbers.stream()//This converts the list numbers into a stream, which allows functional-style operations to be performed on it.
                .filter(n -> n <= 100)          //It only retains the elements for which the condition (n <= 100) is true.
                .collect(Collectors.toList());  //After filtering, the remaining elements are collected back into a List. Collectors.toList() converts the stream back into a regular list after processing.
        System.out.println(filtered);
    }
}
