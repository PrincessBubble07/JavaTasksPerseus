package week5.Question1;

public class adrian_ReverseTask {
    public static void main(String[] args) {

        String str = "adrian brinzila";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}