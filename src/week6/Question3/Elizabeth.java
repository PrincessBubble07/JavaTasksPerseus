package week6.Question3;
import java.util.Scanner;
public class Elizabeth {

    // Sum of digits in a string:
    //  Write a method that can return the sum of the digits in a string.



    public class SumDigitsInString {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a string: "); // ask user for a string
            String s = in.nextLine(); // read string from user
            int sum = 0; // create sum variable and initialize it with 0
            for (int i = 0; i < s.length(); i++) {  // go through all characters of string
                if (Character.isDigit(s.charAt(i))) { // if character is a digit
                    sum += s.charAt(i) - '0';   // then add that digit to sum
                }
            }
            System.out.println(sum);    // finally print the calculated sum
        }
    }





}
