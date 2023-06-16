package src.week4.Question2;

import java.util.Arrays;

public class madeleine {


    public static boolean same(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }


    public static void main(String[] args) {

        System.out.println(same("dog", "cat"));

    }

}
