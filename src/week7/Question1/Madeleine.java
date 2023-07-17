package week7.Question1;

public class Madeleine {

    public static int findMinNum(int[] arr) {

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;
    }

        /*
    Write a method that can find the minimum number from an int Array
     */




}
