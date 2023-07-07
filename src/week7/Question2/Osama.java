package week7.Question2;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
public class Osama {
    public static int[] ascendingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swappable = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swappable;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascendingOrder(new int[]{-3, 10, 2, 30, 4, 11, 20, -7})));
    }
}

