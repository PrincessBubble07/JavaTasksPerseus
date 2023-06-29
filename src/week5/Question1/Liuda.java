package week5.Question1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Liuda {
    /*
       Write a return  method that can find the unique characters from the String
       Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
        */
    public static void main(String[] args) {

        System.out.println(uniqueChar("AAABBBCCCDO0RFF IS"));
        System.out.println(uniqueChar("AAABBBCDCDFFFFJJJOPESNSS"));
        System.out.println(uniqueChar("AAYFOSSABR BBCCNECUDDYWU"));
        System.out.println(uniqueChar("AAABBBCCCDEF"));


        System.out.println(Unique("abcdffkddkddkkdlop"));

        String str = "ssddkkfllgghrwrt";




    }

    public static String uniqueChar(String str) {


        String result = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j); // each character of str
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch1 = str.charAt(i);
                if (ch1 == ch) {       //  if (str.charAt(i) == str1.charAt(j))
                    count++;

                }
            }
            if (count == 1 && !result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;

    }


    public static Map<Character, Integer> Unique(String str) {


        Map<Character, Integer> map = new LinkedHashMap<>();
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (frequency == 1)
                map.put(each.charAt(0), frequency);

        }
        return map;


    }
}