package week6.Question2;

import java.util.Arrays;

public class Leena {
    /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */

    public static int maxValue( int[]  n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;

        return max;
    }
    public static int maxValue2( int[]  n ) {
        Arrays.sort( n );
        return  n [ n.length-1 ];
    }

}
