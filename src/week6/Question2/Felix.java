package week6.Question2;

public class Felix {

    public static int maxNumber(int[] list){

        int max = 0;

        for (int each : list) {
            if (each>max)
                max=each;
        }
        return max;
    }

    /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */

    public static void main(String[] args) {
        System.out.println(maxNumber(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
