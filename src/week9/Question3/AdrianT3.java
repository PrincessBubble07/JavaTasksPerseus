package week9.Question3;

import java.util.ArrayList;
import java.util.List;

public class AdrianT3 {
    //3. ArrayList - Remove some values
    //  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc.
    //  remove all values greater than 100.

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(101);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(102);
        numbers.add(202);

        removeValuesGreaterThan100(numbers);

        System.out.println(numbers);
    }

    public static void removeValuesGreaterThan100(List<Integer> numbers) {
        numbers.removeIf(number -> number > 100);
    }

}
