package week4.Question2;

import java.util.Arrays;
import java.util.TreeSet;

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
public class Osama {
    public static boolean sameLetters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );
        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("osama", "amazo"));
    }
}
