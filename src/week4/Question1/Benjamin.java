package week4.Question1;

public class Benjamin {
    public static void main(String[] args) {

        String word = "AAAAABBBBCCCCCCDDDDDDDD";
        String result = "";
        int j = 0;
        int amount = 0;
        while (j < word.length()) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(j)) {
                    amount++;
                }
            }
            result += word.charAt(j) + "" + amount;
            word = word.replace("" + word.charAt(j), "");
        }
        System.out.println(result);
    }

    }


   /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */