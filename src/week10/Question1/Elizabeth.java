package week10.Question1;

import java.util.ArrayList;


public class Elizabeth {

    /*
    ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
     */
    public static void sortAscending (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                    //This code uses two nested loops to compare each element
                    // of the ArrayList with every other element and swaps them if they are not in ascending order.
                    // This process is repeated until the entire ArrayList is sorted in ascending order.
                }
            }
        }
    }

}

