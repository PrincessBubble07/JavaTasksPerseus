package week9.Question2;

import java.util.ArrayList;
import java.util.List;

public class AdrianT2 {

    //. ArrayList - Remove "Ahmed"
    //  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
    //  Write a java operation to remove all the names named 'Ahmed'

    public static void removeName(List<String> names, String nameToRemove) {
        names.removeIf(name -> name.equals(nameToRemove));
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Alice");
        names.add("Ahmed");

        removeName(names, "Ahmed");

        System.out.println(names);

    }
}