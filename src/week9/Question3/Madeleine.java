package week9.Question3;

import java.util.ArrayList;

public class Madeleine {

    public static void removeValuesGreaterThan100(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 100) {
                list.remove(i);
            }
        }
    }


    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(50);
        numbersList.add(120);
        numbersList.add(80);
        numbersList.add(150);
        numbersList.add(20);
        numbersList.add(40);
        numbersList.add(256);
        numbersList.add(101);
        numbersList.add(10);

        System.out.println(numbersList);

        removeValuesGreaterThan100(numbersList);

        System.out.println("Numbers under 100 removed: " + numbersList);






    }





}
