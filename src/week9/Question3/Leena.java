package week9.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leena {
    /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        ArrayList<Integer> names = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        removeValuesGreaterThan100(names);
    }

    public static void removeValuesGreaterThan100(List<Integer> list) {
        list.removeIf(num -> num > 100);
    }
}
