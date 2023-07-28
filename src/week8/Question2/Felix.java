package week8.Question2;

import java.util.Arrays;

public class Felix {
    /*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */

    public static int [] method2(int [] arr){

        int count = arr.length-1;

        int [] tem = new int[1];

        for (int i = 0; i < arr.length; i++) {


                if (arr[i] == 0) {

                    while (arr[count] == 0) {
                        count--;
                    }
                    if (count<=i)
                        break;
                    tem[0] = arr[count];
                    arr[count] = arr[i];
                    arr[i] = tem[0];
                    count--;

                }


        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(method2(new int[]{1,0,2,0,3,0,4,0})));
    }

}
