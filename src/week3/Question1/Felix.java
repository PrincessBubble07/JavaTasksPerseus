package week3.Question1;

public class Felix {

    public static boolean method1(int n){
            if (n <= 1)
            return false;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(method1(3));
    }
}
/*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */