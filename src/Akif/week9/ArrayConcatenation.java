package Akif.week9;
import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c"};
        String[] array2 = {"d", "e", "f"};
        String[] result = ArrayConcatenation.concatenate(array1, array2);

        System.out.println(Arrays.toString(result));  // Output: [a, b, c, d, e, f]

    }
    public static <T> T[] concatenate(T[] first, T[] second) {//
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }



}
