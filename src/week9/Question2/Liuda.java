package week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liuda {

    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Alina","Eric","Jones", "Eric","Evan","Piter","Jones","Alina","Evan"));
        System.out.println(removeAll(stringList, "Evan"));

    }
    public static List<String> removeAll(List<String> list, String element){
        list.removeIf(n->n.equals(element));
        return list;
    }

}
