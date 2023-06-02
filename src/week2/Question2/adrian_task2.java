package week2.Question2;

public class adrian_task2 {
    public static void main(String[] args) {



    String by3 = "Divisible by 3: ", by5 = "Divisible by 5: ", by15 = "Divisible by 15: ";

        for (int i = 1; i < 100; i++) {
        if (i % 3 == 0 && i % 15 !=0)
            by3 += i + ", ";
        if (i % 5 == 0 && i % 15 !=0){
            by5 += i + ", ";
        }
        if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
            by15 += i + ", ";
        }
    }

        System.out.println(by3.substring(0,by3.length()-2));
        System.out.println(by5);
        System.out.println(by15);
}}
