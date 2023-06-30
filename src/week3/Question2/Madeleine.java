package week3.Question2;

public class Madeleine {

    public static int reverseNegative(int num) { //num= -123
        int reverse = 0;
        int remainder = Math.abs(num); //num = 123

        while (remainder != 0) {
            int digit = remainder % 10; // divides the number by 10 and the remainder becomes the first digit
            //num = 12.3
            reverse = reverse * 10 + digit; //adds the remainder digits we got from above one by one
            // reverse = 3
            remainder = remainder/10; //divide by 10 to remove the remaining digit 
        }

        if (num < 0) {
            return reverse * (-1);
        } else {
            return reverse;
        }


    }
}

/*

Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -123  output: -321

 */
