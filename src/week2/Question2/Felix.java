package week2.Question2;

import java.util.ArrayList;

public class Felix {

    public static void method2(){

        ArrayList<Integer> DividedBy15 = new ArrayList<>();
        ArrayList<Integer> DividedBy3 = new ArrayList<>();
        ArrayList<Integer> DividedBy5 = new ArrayList<>();

        for (int i = 1; i < 101; i++) {

            if (i % 15 == 0){
                DividedBy15.add(i);
            } else if (i % 3 == 0) {
                DividedBy3.add(i);
            }else if (i % 5 == 0){
                DividedBy5.add(i);
            }

        }

        System.out.println("Divisible By 15：" + DividedBy15);
        System.out.println("Divisible By 3：" + DividedBy3);
        System.out.println("Divisible By 5：" + DividedBy5);

    }

    public static void main(String[] args) {
        method2();
    }

}
 /*
    Numbers -- Divisible by 3, 5, 15

     Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
     if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
     if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
     if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

    ex:
    OutPut:
    Divisible By 15 15 30 45 60 75 90
    Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */