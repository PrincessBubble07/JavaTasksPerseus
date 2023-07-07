package week7.Question1;

import java.util.Arrays;

public class Felix {

    public static int min(int [] array){

        Arrays.sort(array);

        return array[0];
    }

    public static void main(String[] args) {
        System.out.println(min(new int[]{1, 2, 3, 4}));
    }
}
/*
    Write a method that can find the minimum number from an int Array
     */