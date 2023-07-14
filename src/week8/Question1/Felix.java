package week8.Question1;

import java.util.Arrays;

public class Felix {/*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */



        public static int[] method1(int N) {
            int a = -(N/2);
            int[] arr = new int[N];
            if(N%2!=0){
                for(int i=0;i<N;i++){
                    arr[i]=a;
                    a = a+1;
                }
            }
            else{
                for(int i=0;i<N;i++){
                    if(a==0){
                        a=a+1;
                    }
                    arr[i]=a;
                    a = a+1;
                }
            }
            return arr;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(method1(7)));
    }

    }



