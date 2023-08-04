package week10.Question2;

import java.util.ArrayList;

/*
   ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
    */
public class Liuda {


        public static void main(String[] args){
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(90);
            arrayList.add(29);
            arrayList.add(99);
            arrayList.add(10);
            arrayList.add(550);
            arrayList.add(55);
            arrayList.add(0);
            arrayList.add(5);
            arrayList.add(50);

            SortingArrayListDesc(arrayList);

        }

        public static void SortingArrayListDesc(ArrayList<Integer> list) {

            for (int i = 0; i < list.size(); i++) {

                for (int j = 0; j < list.size(); j++) {

                    if (list.get(i) > list.get(j)) {

                        Integer temp = list.get(i);

                        list.set(i, list.get(j));

                        list.set(j, temp);

                    }

                }

            }
            System.out.println(list);

        }

    }

