package week9.Question1;

import java.util.Arrays;

public class Liuda {

     /*
    Array - Concat two arrays
  Write a return method that can concat two arrays.
     */


    public static void main(String[] args) {
        int [] arr1 = {20,10,33,45,19};
        int [] arr2 ={100,200,99,7,66,98,76};

        System.out.println(Arrays.toString(twoArraysConcat(arr1,arr2)));

    }

    public static int[] twoArraysConcat(int[] arr1, int[] arr2){

        int [] arr3 = new int[arr1.length+ arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[index]=arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }

        return arr3;
    }

}
