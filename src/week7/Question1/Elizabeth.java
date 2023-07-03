package week7.Question1;

public class Elizabeth {

    //  /*
    //    Write a method that can find the minimum number from an int Array
    //     */
    public static void main(String[] args) {

        int[] numbers = {100, 6, 34, 87, 67};

        int min = numbers[0]; // assume that first element is the minimum number

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...

            if(numbers[i] < min){ // compares the element of the array with current minimum number
                min = numbers[i]; // replace the current minimum number
            }

        }


        System.out.println("min = " + min);



    }

}