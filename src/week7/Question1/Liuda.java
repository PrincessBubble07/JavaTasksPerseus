package week7.Question1;
/*
   Write a method that can find the minimum number from an int Array
    */
public class Liuda {

    public static int findMin(int[] arr){

        int minNumber = arr[0];

        for (int eachNumber : arr) {
            if (eachNumber<minNumber){
                minNumber=eachNumber;
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        System.out.println("minimum number of array: " + findMin(new int[]{12,23,10,1,0,-2,30}));
    }
}
