package week1.Question2;

public class Osama {
    public static void task2(int num1, int num2) {

        int sign = 1;

        int answer = 0;

        if (num1 * num2 < 0) {
            sign = -1;
        }
        int a = Math.abs(num1);
        int b = Math.abs(num2);

        while (a >= b) {
            a -= b;
            answer++;
        }
        System.out.println(sign * answer + " Remainder: " + sign * a);
    }

}
