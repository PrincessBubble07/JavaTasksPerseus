package week1.Question1;
import java.util.Scanner;

public class Liza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")){
            System.out.println("Enter a number:");
            int number = input.nextInt();
            if(number %2==0) {
                System.out.println(number + " is an even number");
            }else{
                System.out.println(number+ " is an odd number");
            }
            System.out.println("Would you like to enter another number? Yes/No");
            answer = input.next().toLowerCase();
            while( !(answer.equals("yes") || answer.equals("no")) ){
                System.out.println("Invalid Entry! Whould you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }
        }
    }
}
