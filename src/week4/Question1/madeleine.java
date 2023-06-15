package src.week4.Question1;

public class madeleine {
    public static String freqOfChar(String str){


        // String str = "aabcccd";

        String result = ""; //a2b1c3d1
        // a b c d
        //  2 1 3 1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //a
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (result.contains("" + ch)) { //if the character is already included in the result
                continue; //skip that character
            }
            result += ch + "" + count; //concatenate to an empty string

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(freqOfChar("aabcccd"));


    }





}
