package week9.Question2;
import java.util.ArrayList;
import java.util.Arrays;

public class Elizabeth {


    ///*
    //    ArrayList - Remove "Ahmed"
    //  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
    //  Write a java operation to remove all the names named 'Ahmed'
    //     */

        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();
            list.addAll(Arrays.asList("John", "Ahmed", "Eric", "Ahmed"));

            list.removeAll(Arrays.asList("Ahmed"));

            System.out.println(list);

        }
}
