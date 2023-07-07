package week7.Question1;

import java.util.Arrays;

/*
   Write a method that can find the minimum number from an int Array
    */
public class Osama {
    public static int minNumber(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] example = {10,20,30,40,50,60};
        System.out.println("minNumber(example) = " + minNumber(example));
    }

}
