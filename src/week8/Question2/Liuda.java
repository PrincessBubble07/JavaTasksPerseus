package week8.Question2;


import java.util.Arrays;

public class Liuda {

    public static int[] moveZeroToEnd(int[] arr){


            int[] arr2 = new int[arr.length];
            int j = 0;    //j - index of arr2
            for (int i =0; i<arr.length;i++) {
                if (arr[i] != 0){
                    arr2[j] = arr[i];
                    j++;
                }
            }
            return arr2;
        }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroToEnd(new int[]{-3,0,2,30,0,11,20,-7})));
    }


}
