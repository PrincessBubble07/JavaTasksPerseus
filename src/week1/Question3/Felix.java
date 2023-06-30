package week1.Question3;

public class Felix {

    public static void method3(){
        for (int i = 1; i < 31; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 ==0) {
                System.out.println("RA");
            } else if (i % 3==0){
                System.out.println("FIN");
            }else {
                System.out.println(i);
            }
        }

    }

}
