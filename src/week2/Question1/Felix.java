package week2.Question1;

public class Felix {

public static void method1(int x, int y){

    x += y;
    y = x - y;
    x -= y;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
}

    public static void main(String[] args) {
        method1(9,3);
    }
}
  /*
    Swap Numbers

    Swap two variable' values without using a third variable
     */