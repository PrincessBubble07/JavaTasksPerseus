package week4.Question1;
/*➡️ String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC*/
public class Liuda {
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String str) {

        String result = ""; // "ABC"
        for (int i = 0; i < str.length(); i++) { // i: index number of str
            char each = str.charAt(i); // each character of the String str
            if (!result.contains("" + each)) { // if the String result does not contain the character of string str yet
                result += each; // then we will add character to string result
            }

            // if the character is not contained yet in the new string, then we will add it to the  new string
        }

        return result;

    }
}
