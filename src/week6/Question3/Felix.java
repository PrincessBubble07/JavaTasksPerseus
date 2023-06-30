package week6.Question3;

import java.util.ArrayList;
import java.util.Arrays;

public class Felix {

    public static int sum(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i)))

                sum+=str.charAt(i)-'0';

        }
        return sum;
    }

    /*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */

    public static void main(String[] args) {
        System.out.println(sum("A3v15"));
    }
}
