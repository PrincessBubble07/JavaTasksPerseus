package week6.Question3;

public class Osama {
    public static int sumOfDigits(String str){

        int sum1 = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum1 += Character.getNumericValue(ch);

            }
        }
        return sum1;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("www34eer5"));
    }
}
