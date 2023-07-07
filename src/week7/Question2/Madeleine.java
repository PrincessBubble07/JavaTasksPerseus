package week7.Question2;

import java.util.Arrays;

public class Madeleine {

    public static int findMaxNum(int[] arr) {

        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }

        }
        return max;
    }

    public static int[] sortAscendingOrder(int[] arr){

        int max = findMaxNum(arr);
        int[] ascendingOrder = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int minIndex = i;

            for (int j = 0; j < arr.length; j++) {

                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }

            }

            ascendingOrder[i] = min;
            arr[minIndex] = max;


        }
        return ascendingOrder;

    }








}
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
