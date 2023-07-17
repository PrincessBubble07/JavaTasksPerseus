package week8.Question2;

public class Madeleine {



    public static int[] moveZerosToEnd(int[] array) {

        for (int i = 0; i < array.length; i++) { // determines the number of turns for swapping, iterates from 0 to the length of array
            for (int j = array.length-1; j > 0; j--) { // the last element will be checked first, this loop iterates over the array in reverse order starting with the last element and going to the second element, skipping the first element at index 0 since there is no element before it to swap with
                if(array[j] != 0){ // if element starting at the last index is NOT zero
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp; // swaps the elements starting from the last index going to the first,
                }                           //placing the zeroes to the last indexes because of the if condition earlier
            }
        }
        return array;
    }














}
