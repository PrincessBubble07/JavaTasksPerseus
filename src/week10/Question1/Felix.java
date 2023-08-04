package week10.Question1;

import java.util.ArrayList;
import java.util.Arrays;

public class Felix /*
    ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
     */{

    public static ArrayList<Integer> Ascending(ArrayList<Integer> array){

        for (int i = 0; i < array.size(); i++) {

            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(0);

            int min = Integer.MAX_VALUE;

            for (int j = i; j < array.size(); j++) {

                if (min>array.get(j)) {
                    min = array.get(j);


                    arr.set(0,array.get(i));
                    array.set(i,array.get(j));
                    array.set(j,arr.get(0));
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,4,5,1,6));
        System.out.println(Ascending(list));
    }
}
