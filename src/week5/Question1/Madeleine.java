package week5.Question1;

public class Madeleine {

    public static String uniqueChars(String str) {

        String unique = "";

        for (int j = 0; j < str.length(); j++) {     //iterate over each character in str

            char ch = str.charAt(j);         // char variable ch to represent the chars on the string at each index
            int frequency = 0;       //int variable to help determine if ch matches another char on str


            for (int i = 0; i < str.length(); i++) {    //checks how many times the ch has appeared in the string str
                if (str.charAt(i) == ch) {      //if the ch has appeared in the string
                    frequency++;    //increase frequency by 1
                }
            }

            if (frequency == 1) {   // if the frequency is equal to one it is unique
                unique += ch;
            }
        }

        return unique;

    }

}
