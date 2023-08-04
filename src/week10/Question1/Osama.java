package week10.Question1;

import java.util.ArrayList;

public class Osama { public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(34);
    arr.add(55);
    arr.add(6);
    arr.add(91);
    System.out.println(ascOrder(arr));
}

    public static ArrayList<Integer> ascOrder(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temporary = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temporary);
                }
            }
        }
        return arr;
    }
}
