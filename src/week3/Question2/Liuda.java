package week3.Question2;

public class Liuda {

    public static int ReverseNegativeNumber(int num){

        int reverse =0;
        int reminder = 0;

        while (num!=0){
            reminder = num%10;
            reverse = reverse*10+reminder;
            num/=10;
        }

        return reverse;
    }


}

