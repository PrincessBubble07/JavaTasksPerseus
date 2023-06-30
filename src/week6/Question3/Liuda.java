package week6.Question3;
/*3. Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
        */
public class Liuda {

    public static int sumOfDigits(String str){

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            //char ch = str.charAt(i);
            if (Character.isDigit(str.charAt(i))){
                String digits = str.substring(i,i+1);
                sum+=Integer.parseInt(digits);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("sumOfDigits = " + sumOfDigits("A3v15"));
    }
}
