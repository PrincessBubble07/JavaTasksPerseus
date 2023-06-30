package week2.Question2;

public class Osama {
    public static String numberDivisible(int num){
        String result = "";
        for (int i = 1; i <= 100 ; i++) {
            if (num%15==0){
                result = "Divisible By 15";
            } else if (num%5==0) {
                result = "Divisible By 5";
            } else if (num%3 == 0) {
                result = "Divisible By 3";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberDivisible(90));
    }
}
