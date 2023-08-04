package week10.Question2;

import java.util.ArrayList;
import java.util.Arrays;
/*
    ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
     */
public class Felix {
    public static ArrayList<Integer> Descending(ArrayList<Integer> array){

        for (int i = 0; i < array.size(); i++) {

            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(0);

            int max = Integer.MIN_VALUE;

            for (int j = i; j < array.size(); j++) {

                if (max<array.get(j)) {
                    max = array.get(j);


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
        System.out.println(Descending(list));
    }
}
