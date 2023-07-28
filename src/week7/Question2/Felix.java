package week7.Question2;

import java.util.Arrays;


public class Felix {

    public static int[] Ascending(int[] array){

        for (int i = 0; i < array.length; i++) {

            int [] arr = new int[1];

            int min = Integer.MAX_VALUE;

            for (int j = i; j < array.length; j++) {

                if (min>array[j]) {
                    min = array[j];

                    arr[0]=array[i];
                    array[i]=array[j];
                    array[j]=arr[0];
                }
            }
        }
        return array;
        }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Ascending(new int[]{10, 9, 8, 7})));
    }

}
/*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */