package week9.Question1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Felix {
     /*
    Array - Concat two arrays
  Write a return method that can concate two arrays.
     */

    public static String[] concateTwoArrays(String[] A,String[] B){

        int length = A.length+ B.length;

        String [] C = new String[length];

        for (int i = 0,j = 0; i < length; i++,j++) {

            if(i< A.length){

                C[i] = A[i];

            }else {

                C[i]=B[j- A.length];

            }

        }
        return C;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concateTwoArrays(new String[]{"a", "b", "c"}, new String[]{"d", "e", "f"})));
    }

}
