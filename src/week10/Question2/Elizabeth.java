package week10.Question2;

import java.util.ArrayList;

public class Elizabeth {

     /*
    ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
     */


    public static void DescendingOrder (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {    //The outer loop iterates over each element of the ArrayList,
                // while the inner
                // loop iterates over all the elements that come after it.
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
 //This method uses two nested loops to compare each element of the ArrayList
    // with every other element and swap them if they are not in the correct order.
    //

}
