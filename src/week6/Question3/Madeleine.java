package week6.Question3;

public class Madeleine {

    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);

            }
        }
        return sum;
    }










}




