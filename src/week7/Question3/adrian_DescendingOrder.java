package week7.Question3;

import java.util.Arrays;

public class adrian_DescendingOrder {

    public static int[] descending(int[] array){

        for (int i = 0; i < array.length; i++) {

            int [] arr = new int[1];

            int max = Integer.MIN_VALUE;

            for (int j = i; j < array.length; j++) {

                if (max<array[j]) {
                    max = array[j];

                    arr[0]=array[i];
                    array[i]=array[j];
                    array[j]=arr[0];
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(descending(new int[]{10,20,7, 8, 90})));
    }
}
