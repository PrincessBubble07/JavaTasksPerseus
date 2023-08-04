package week10.Question2;

import java.util.ArrayList;

public class Madeleine {



    public static ArrayList<Integer> sortArrayListDesc(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int temp = 0;
                if (list.get(i) < list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }




    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(-8);
        list.add(8);
        list.add(8);
        list.add(1);
        list.add(0);
        list.add(-23);
        list.add(39);


        System.out.println("Original list: " + list);

        ArrayList<Integer> sortedNumbers = sortArrayListDesc(list);

        System.out.println("In descending order: " + sortedNumbers);




    }


}
