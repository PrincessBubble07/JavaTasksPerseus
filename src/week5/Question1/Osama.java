package week5.Question1;

 /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

public class Osama {
    public static String unique(String str) {
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                char each = str.charAt(j);
                if (ch == each){
                    count++;
                }
            }
            if (count == 1){
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(unique("osama"));
    }
}
