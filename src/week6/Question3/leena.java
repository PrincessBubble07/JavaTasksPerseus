package week6.Question3;

public class leena {
    /*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */

    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.parseInt(""+each);
            }
        }
        return total;
    }

}
