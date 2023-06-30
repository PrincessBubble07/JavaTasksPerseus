package week3.Question1;

import java.util.Scanner;

public class Liza {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Scanner declaration
    //Use Scanner to take input
    int n = sc.nextInt();
    int count = 0;
    for (int i =1; i<=n;i++)
    {
        if(n%i==0)
            count++;
    }
    if(count==2)
        System.out.println("Prime");
    else
        System.out.println("Not Prime");

}

}


/*

 Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not



 */