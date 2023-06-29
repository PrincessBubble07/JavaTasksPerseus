package week6.Question2;

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








}
