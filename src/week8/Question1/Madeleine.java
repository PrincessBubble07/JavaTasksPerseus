package week8.Question1;

import java.util.Arrays;

public class Madeleine {


    public static int[] arraySumEqualsToZero(int integer1) {

        int[] arr1 = new int[integer1];

        System.out.println(Arrays.toString(arr1));

        int positive = 1;
        int negative = -1;

        for (int i = 0, j = arr1.length - 1; i < j; i++, j--) {

            arr1[i] = positive;
            arr1[j] = negative;
            positive++;
            negative--;

        }

        return arr1;
    }












}
