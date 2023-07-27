package week9.Question1;

import java.util.Arrays;

/*
    Array - Concat two arrays
  Write a return method that can concat two arrays.
     */
public class Osama {
    public static int[] concatArr(int[] arr1 , int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0 , j = 0; i < arr3.length; i++) {
            if (i < arr1.length){
                arr3[i] = arr1[i];
            }else {
                arr3[i] = arr2[j++];
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {10,20,30}, arr2 = {40,50,60};
        System.out.println(Arrays.toString(concatArr(arr1, arr2)));
    }
}
