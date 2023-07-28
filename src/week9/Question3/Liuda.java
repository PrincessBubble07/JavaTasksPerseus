package week9.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liuda {

    /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,22,13,4,15,1000,2000,300));
        System.out.println(removeNumbersIf(integerList,100));

    }
    public static List<Integer> removeNumbersIf(List<Integer> list, int number){

            list.removeIf(n->n>number);
            return list;


    }


}
