package week7.Question3;

import java.util.Arrays;

/*
  Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
   */
public class Osama {
    public static int[] descendingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int swappable = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swappable;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(descendingOrder(new int[]{-444, 356, 987, 12, -364, 2431, -987})));
    }
}
