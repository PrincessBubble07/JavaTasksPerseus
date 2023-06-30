package week2.Question1;

public class Question1 {
    public static void main(String[] args) {

        System.out.print("Divisible By 15 ");
        for (int num = 1; num < 101; num ++) {
        if(num %15 ==0 && num% 5 ==0 && num %3 ==0){
            System.out.print(num + " ");
        }
        }

        System.out.println();

        System.out.print("Divisible By 5 ");
        for (int num = 0; num < 101; num++) {
            if(num % 5 ==0 && num % 15 !=0){
                System.out.print(num + " ");
            }

        }

        System.out.println();

        System.out.print("Divisible By 3 ");
        for (int num = 1; num <101 ; num++) {
            if(num%3 ==0 && num%15 !=0){
                System.out.print(num + " ");
            }
        }

    }

}

/*
Numbers - Divisible by 3, 5, 15
 */