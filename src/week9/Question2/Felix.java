package week9.Question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Felix {
    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */
    public static ArrayList<String> removeAhmed(ArrayList<String> arrayList){

        arrayList.removeIf(n -> (n.equals("Ahmed")));

        return arrayList;
    }

    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>();

        List.add("Ahmed");
        List.add("Felix");
        List.add("Felix");
        List.add("Ahmed");

        System.out.println((removeAhmed(List)).toString());

    }

}
