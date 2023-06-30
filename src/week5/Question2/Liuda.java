package week5.Question2;

public class Liuda {

    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        System.out.println(reverseStr("abcdefgh"));

    }

    public static String reverseStr(String str){

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            char ch = str.charAt(i);
            reverse+=ch;

        }


        return reverse;

    }


}
