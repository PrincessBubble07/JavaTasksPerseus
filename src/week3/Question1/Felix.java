package week3.Question1;

public class Felix {

    public static String method1(int n){

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0){
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        System.out.println(method1(3));
    }
}
/*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */