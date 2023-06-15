package week4.Question1;

public class Felix {

    public static void method1(String str){

        String result ="";

        for (int j = 0; j < str.length(); j++) {

            int count = 0;

            char ch = str.charAt(j);

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i)==ch){
                    count++;
                }

            }
            if(result.contains(ch+""))
                continue;
            result+= ch+""+count;

        }
        System.out.println(result);
    }

    //test
    public static void main(String[] args) {

        method1("AAABBCDD");
    }
}
 /*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */