package week1.Question2;

import static java.lang.Math.abs;

public class Felix {

    public static void method2(int num1, int num2) {

        int sign = 1;

        int answer = 0;

        if (num1*num2 <0){
            sign = -1;
        }
        int a = abs(num1), b = abs(num2);

        while(a>=b){
            a-=b;
            answer++;
        }
        System.out.println(sign*answer + " Remainder: " + sign*a);
    }

}
