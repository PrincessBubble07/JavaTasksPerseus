package week7.Question2;

import java.util.Arrays;

/*
   Write a return method that can sort an int array in Ascending order without using
    the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
    */
public class Liuda {

    public static int[] sortArrayAscending(int[] arr){


         for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                int integerForTemporrValue = 0;
                if (arr[j] < arr[i]) {
                    integerForTemporrValue=arr[i];
                    arr[i] = arr[j];
                    arr[j]=integerForTemporrValue;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayAscending(new int[]{-3,10,2,30,4,11,20,-7})));
    }
}
