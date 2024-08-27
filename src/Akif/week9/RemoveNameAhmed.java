package Akif.week9;
import java.util.ArrayList;
import java.util.List;
public class RemoveNameAhmed {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ahmed", "John", "Eric", "Ahmed", "Aaron","Ahmed","Akif"));
        names.removeIf(name -> name.equals("Ahmed"));//This is a method of the List interface that removes all elements of the list that match a given condition. The condition is defined in the parentheses.
        System.out.println(names);
    }

}
/*Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
*/