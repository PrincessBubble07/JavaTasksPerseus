package week8.Question2;

import java.util.Arrays;

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
   */
public class Osama {
    public static int[] moveZeros(int[] arr){
        int[] arr2 = new int[arr.length];
        int index = 0;
        for (int i : arr) {
            if (i != 0){
                arr2[index] = i;
                index++;
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {23,4,0,6,77,0,55,0,0,3};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }
}
