package ensar.week9;

import java.util.*;

public class RemoveSomeValues {

    public static void main(String[] args) {
        List<Integer> givenIntList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println(removeOver100(givenIntList));

        System.out.println(removeOver100UsingLambda(givenIntList));
    }

    private static List<Integer> removeOver100(List<Integer> intList) {
        List<Integer> result = new ArrayList<>();

        for (Integer eachNum : intList) {

            if (eachNum < 101) {
                result.add(eachNum);
            }
        }

        return result;
    }

    private static List<Integer> removeOver100UsingLambda(List<Integer> intList) {
        intList.removeIf(p -> p > 100);

        return intList;
    }

}
