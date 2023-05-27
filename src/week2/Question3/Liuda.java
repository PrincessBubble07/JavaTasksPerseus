package week2.Question3;

import java.util.Scanner;

public class Liuda {

    public static void function1() {

        System.out.println("Enter your number:");

        int n = new Scanner(System.in).nextInt();


        for (int i = 1; i <= n; i++) {

            if (i % 30 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 15 == 0) {
                System.out.println("TestCoders");
            } else if (i % 10 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 6 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else {
                System.out.println(i);

            }

        }

    }
    public static void main(String[] args) {

        function1();

    }

}
