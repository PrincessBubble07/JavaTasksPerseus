package week5.Question2;

public class Madeleine {
    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }



    public static void main(String[] args) {


        System.out.println(reverse("noopS nedooW"));


    }
}
