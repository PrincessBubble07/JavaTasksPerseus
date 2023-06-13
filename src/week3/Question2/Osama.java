package week3.Question2;

public class Osama {
    public static void reverse(int num) {//-123
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;     // 321
            reverse = reverse * 10 + remainder;// 321
            num = num / 10;//-12  -1  0
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverse(-1234);
    }
}
