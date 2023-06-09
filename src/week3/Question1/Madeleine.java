package week3.Question1;

public class Madeleine {

    public static boolean isPrime(int a){
        if (a <= 1) { //prime number cannot be one
            return false;
        }

        if (a == 2 || a == 3) { //if number is 2 or 3 it is prime
            return true;
        }

        if (a % 2 == 0) { //if the number is divisible by 2 it is not prime
            return false;
        }

        for (int i = 3; i * i <= a; i += 2) { //starting at i = 3, i is increased by 2 to ensure we are only dealing with odd numbers
            //loop will run as the square of i is less than or equal to a
            if (a % i == 0) { //if the number a divided by itself has no remainder, it is not prime
                return false;
            }
        }

        return true;
    }

}


/*
Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -123  output: -321

     */