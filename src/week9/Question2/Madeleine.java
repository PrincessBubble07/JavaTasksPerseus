package week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Madeleine {


    public static ArrayList<String> removeNameFromArrayList(String name, ArrayList<String> list){

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(name)) {
                list.remove(i);
            }

        }
        return  list;
    }


    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Mohammed","Mina", "Alexandria", "Thomas", "Mina", "Joseph"));

        System.out.println(removeNameFromArrayList("Mina", employees));


    }






}
