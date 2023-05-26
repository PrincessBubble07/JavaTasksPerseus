package week1.Question2;

public class Madeleine {

    public static String divideWithoutOperator(int num1, int num2){
        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }return count+" REM:"+num1;

    }


}
