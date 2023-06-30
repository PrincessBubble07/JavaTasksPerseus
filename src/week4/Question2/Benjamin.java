package week4.Question2;

import java.util.Arrays;

public class Benjamin {
    public static void main(String[] args) {
      /*  String result = "";
        String one = "cat";
        String two = "act";
        int length = one.length();
        for (int i = 0; i < length; i++) {
            result += one.charAt(i) + "";
        }
        System.out.println(result);
*/


        String one = "cat";
        String two = "tca";

        char arrayOne [] = one.toCharArray();
        char arrayTwo [] = two.toCharArray();

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        boolean result = Arrays.equals(arrayOne, arrayTwo);

        System.out.println(result);
    }

}

     /*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */