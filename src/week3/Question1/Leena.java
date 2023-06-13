package week3.Question1;

public class Leena {
       /*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */
       public static boolean isPrime(int number) {
           if (number < 2) {
               return false;
           }

           for (int i = 2; i <= Math.sqrt(number); i++) {
               if (number % i == 0) {
                   return false;
               }
           }

           return true;
       }
}
