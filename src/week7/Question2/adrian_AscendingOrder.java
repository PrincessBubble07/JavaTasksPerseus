package week7.Question2;

import java.util.Arrays;

public class adrian_AscendingOrder {
    public static int[] Ascending(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int[] arr = new int[1];

            int min = Integer.MAX_VALUE;

            for (int j = i; j < array.length; j++) {

                if (min > array[j]) {
                    min = array[j];

                    arr[0] = array[i];
                    array[i] = array[j];
                    array[j] = arr[0];
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Ascending(new int[]{10,9,8,7})));
    }

}

