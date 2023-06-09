package week3.Question2;

public class Liuda {
    public static boolean PrimeOrNot(int number) {

        if(number<=1){
            return false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;

            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println("Number is Prime "+PrimeOrNot(17));


    }
}
