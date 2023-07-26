package week9.Question1;

import java.util.Arrays;

public class Elizabeth {
    /*
    Array - Concat two arrays
  Write a return method that can concate two arrays.
     */

    public static void main(String[] args) {
        int [] arr1 = {1, 2};
        int [] arr2 = {3,4};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));

    }
    public static int[] concatArrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];
        // i -> add to the merged array, also read from the arr1
        // y -> read the elements from the arr2

        for(int i = 0, y = 0; i < merged.length; i++){

            if(i < arr1.length){
                merged[i] = arr1[i];
            } else {
                merged[i] = arr2[y++];
            }

        }

        return merged;
    }
}


