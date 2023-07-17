package week8.Question1;
    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answer is [-1,0,1] (but there are many more
correct answer).
     */

import java.util.ArrayList;
import java.util.Arrays;

public class Osama {
    public static int[] sumZero(int n) {
        if (n<=1||n>100){
            return new int[0];
        }
        ArrayList<Integer> arrList = new ArrayList(n);

        for (int i = 1; i <= n / 2; i++) {
            arrList.add(-i);
            if (n % 2 == 1) 
                arrList.add(0);
            arrList.add(i);
        }
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            arr[i] = arrList.get(i);
        }
        return arr;
    }


    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(sumZero(n)));
    }
}
