package week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leena {
    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        removeName(names, "Ahmed");
        System.out.println(names);

        //or
        names.removeAll( Arrays.asList("Ahmed"));

    }

    public static void removeName(List<String> list, String nameToRemove) {
        list.removeIf(name -> name.equals(nameToRemove));
    }
}
