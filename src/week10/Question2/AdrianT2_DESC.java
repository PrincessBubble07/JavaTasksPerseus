package week10.Question2;

import java.util.ArrayList;

public class AdrianT2_DESC {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(3);

        sortDescOrder(arrayList);
        System.out.println(arrayList);
    }

    public static void sortDescOrder(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrayList.get(j) < arrayList.get(j + 1)) {
                    // Swap elements j and j + 1 for descending order
                    int temporary = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temporary);
                }
            }
        }
    }
}



