package week3.Question2;

public class Liza {

    public static void main(String[] args) {

        //In this program, while loop is used to reverse a number
        // as given in the following steps:

        int num = -123, reversed = 0;

        System.out.println("Original Number: " + num);


        // run loop until num becomes 0
        //First, the remainder of the num divided by 10 is
        //stored in the variable digit.
            while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            //digit is then added to the variable reversed after multiplying it by 10.
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}



/*
Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -123  output: -321


 */