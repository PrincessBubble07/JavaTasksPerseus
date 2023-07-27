package week9.Question3;

import java.util.ArrayList;

public class Felix {
    /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */ public static ArrayList<Integer> removeGreater100(ArrayList<Integer> arrayList){

        arrayList.removeIf(n -> (n > 100));

        return arrayList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();

        List.add(1);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(2);

        System.out.println((removeGreater100(List)).toString());

    }
}
