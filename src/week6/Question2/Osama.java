package week6.Question2;

public class Osama {
    public static int maxNumber(int[] arr){

        int max = 0;

        for (int each : arr) {
            if (each>max)
                max=each;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
