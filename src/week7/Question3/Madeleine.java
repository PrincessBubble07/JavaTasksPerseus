package week7.Question3;

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


    public static int[] sortDescendingOrder(int[] arr){

        int min = findMinNum(arr);
        int[] descendingOrder = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int max = arr[i];
            int maxIndex = i;

            for (int j = 0; j < arr.length; j++) {

                if(arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }

            }

            descendingOrder[i] = max;
            arr[maxIndex] = min;


        }
        return descendingOrder;

    }






}

    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */