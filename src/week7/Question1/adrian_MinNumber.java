package week7.Question1;

public class adrian_MinNumber {
    /*
    Write a method that can find the minimum number from an int Array
     */
    public static int minNumber(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {12,30,20,40,50};
        System.out.println("minNumber(numbers) = " + minNumber(numbers));
    }
}


