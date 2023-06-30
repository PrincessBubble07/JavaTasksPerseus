package week4.Question1;

import javax.xml.stream.events.Characters;
import java.util.HashMap;
import java.util.Map;

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/
public class Osama {
    public static String frequencyOfCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {


            int frequency = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    frequency++;

                }
            }
            if (result.contains("" + ch)) {
                continue;
            }

            result += ch + "" + frequency;
        }
        return result;
    }



}

