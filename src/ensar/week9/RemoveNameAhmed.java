package ensar.week9;

import java.util.*;

public class RemoveNameAhmed {

    public static void main(String[] args) {
        List<String> givenNameList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        String givenName = "Ahmed";

        System.out.println(removeName(givenNameList, givenName));

        System.out.println(removeNameUsingLambda(givenNameList, givenName));
    }

    private static List<String> removeName(List<String> nameList, String name) {
        List<String> result = new ArrayList<>();

        for (String eachName : nameList) {

            if (!eachName.equals(name)) {
                result.add(eachName);
            }
        }

        return result;
    }

    private static List<String> removeNameUsingLambda(List<String> nameList, String name) {
        nameList.removeIf(p -> p.equals(name));

        return nameList;
    }

}
