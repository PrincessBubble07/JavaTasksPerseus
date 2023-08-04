package week10.Question1;

import java.util.ArrayList;
import java.util.List;

/*
   ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
    */
public class Liuda {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(90);
        arrayList.add(29);
        arrayList.add(99);
        arrayList.add(10);
        arrayList.add(550);
        arrayList.add(50);
        arrayList.add(0);
        arrayList.add(55);
        arrayList.add(5);
        arrayList.add(502);

        SortingArrayListAsc(arrayList);


    }
    public static void SortingArrayListAsc(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }
        System.out.println(list);

    }


}
