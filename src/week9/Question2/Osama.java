package week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
   ArrayList - Remove "Ahmed"
 Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
 Write a java operation to remove all the names named 'Ahmed'
    */
public class Osama {
    public static List<String> removeEric(List<String> listOfName){
        Iterator<String> iterator = listOfName.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("Eric")){
                iterator.remove();
            }
        }
        return listOfName;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Eric"));
        System.out.println(removeEric(names));
    }
}
