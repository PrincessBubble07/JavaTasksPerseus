package week2.Question2;

import java.util.Scanner;

public class Liuda {

    public static void main(String[] args) {

        String result1 = "";
        String result2 = "";
        String result3 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                result1 += i + " ";

            } else if (i % 3 == 0) {
                result2 += i + " ";

            } else if (i % 5 == 0) {
                result3 += i + " ";
            }
        }
            System.out.println("Divisible By 15: "+result1);
            System.out.println("Dvisible By 5: "+result3);
            System.out.println("Divisible By 3: "+result2);

        }
    }

