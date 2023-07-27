package week9.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
   ArrayList - Remove some values
 Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    */
public class Osama {
    public static List<Integer> removeMethod(List<Integer> num){
        num.removeIf(p-> p > 100);
        return num;
    }
    public static List<Integer> removeMethod2(List<Integer> num){
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()){
            if (iterator.next() > 100){
                iterator.remove();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,23,300,4,56,678,1009,24,56,-2));
        System.out.println(removeMethod(numbers));
        System.out.println(removeMethod2(numbers));

    }
}
