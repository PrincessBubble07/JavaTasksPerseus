package week9.Question1;

import java.util.ArrayList;
import java.util.Arrays;

public class AdrianT1 {
    // 1. Array - Concat two arrays
    //  Write a return method that can concate two arrays.

    public static int[] TwoArrays(int[] arr1, int[] arr2) {

       int[] concatenated_arrays = new int[ arr1.length + arr2.length];
        System.arraycopy(arr1, 0, concatenated_arrays, 0, arr1.length);
        System.arraycopy(arr2, 0, concatenated_arrays, arr1.length, arr2.length);

        return concatenated_arrays;

    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] result = TwoArrays(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}
