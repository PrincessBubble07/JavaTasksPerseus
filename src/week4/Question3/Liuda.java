package week4.Question3;
/*➡️ String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/

public class Liuda {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));

    }

    public static String frequencyOfChars(String str){

        String result="";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; //reset to  0  every execution

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if(result.contains(""+ch)){ // if the characters is already included in the result
                continue; //skip that character
            }
            result +=ch + "" +count;
        }
        return result;
    }
}
