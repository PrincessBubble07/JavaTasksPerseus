package week9.Question1;

import java.util.Arrays;

public class Leena {
    /*
    Array - Concat two arrays
  Write a return method that can concate two arrays.
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] resultArray = concatArrays(array1, array2);

        System.out.println(Arrays.toString(concatArrays(array1,array2)));
    }

    public static int[] concatArrays(int[] arr1, int[] arr2) {

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] resultArray = new int[len1 + len2];

        int i = 0;
        for (int num : arr1) {
            resultArray[i] = num;
            i++;
        }

        for (int num : arr2) {
            resultArray[i] = num;
            i++;
        }

        return resultArray;
    }
}
