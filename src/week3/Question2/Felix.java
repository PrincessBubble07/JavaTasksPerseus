package week3.Question2;

public class Felix {

    public static int method2(int n){

        n = -1 * n;

        int reverse = 0;
        int lastNumber = 0;

        while(n > 0){

            lastNumber = n % 10;
            reverse = 10 * reverse + lastNumber;
            n = n / 10;

        }

return reverse*(-1);

    }

    public static void main(String[] args) {
        System.out.println(method2(-678));
    }

}
/*Numbers -- Reverse Negative Number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -123  output: -321

     */