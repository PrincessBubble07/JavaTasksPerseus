package week9.Question1;

import java.util.Arrays;

public class Madeleine {

    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length]; //we need to make sure that the third array has enough capacity to store arr1 & arr2

        int k = 0; // for third arrays index numbers

        for (int i = 0; i < arr1.length; i++, k++) { //for first arrays index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //for second arrays index numbers
            arr3[k] = arr2[i];
        }
        return arr3;

    }




    public static void main(String[] args) {
        String[] names1 = {"Bill", "Joe", "Michael", "Dennis"};
        String[] names2 = {"Rebecca", "Sue", "Pam"};


        System.out.println(Arrays.toString(mergeArrays(names1, names2)));


    }











}
