package week8.Question1;

public class Elizabeth {
    public static void main(String[] args) {

    }

    public int[] uniqueIntegers(int N) {
        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {  // filling the array with the integers from 0 to N-2 (
            result[i] = i;
            sum += i;
        }

        result[N - 1] = -sum; // setting the last element to the negative of the sum of all the other elements
         // so the sum of all elements in the array is 0
        return result;
    }



}


    /*
    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */





