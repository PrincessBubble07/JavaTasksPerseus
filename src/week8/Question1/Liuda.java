package week8.Question1;

import java.util.ArrayList;
import java.util.Arrays;

public class Liuda {


   /* public static int[] sumZero1(int n) {
        int[] v = new int[n];
        for(int i=0;i<n;i++)
            v[i]= 2*i - n + 1;
        return v;
    }*/


        public static int[] sumZero(int n) {
        ArrayList<Integer> result = new ArrayList(n);


        if(n % 2 == 0){

            for(int i = 1; i <= n /2; i++){

                result.add(i);
                result.add(-i);

            }
        }
        else{
            result.add(0);
            for(int i = 1; i <= n/2 ; i++){
                result.add(i);
                result.add(-i);


            }
        }
        int[] ans = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {

       /* int[] output = sumZero1(7);
        for(int i=0;i<7;i++)
        System.out.print(output[i]+" ");


        System.out.println();*/


        System.out.println(Arrays.toString(sumZero(12)));


    }
}
