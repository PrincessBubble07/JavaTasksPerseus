package week5.Question2;

public class Liza {


    //  Write a return method that can reverse  String
    //    Ex: Reverse("ABCD"); ==> DCBA
    //



    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverse += str.charAt(i);
        }

        return reverse;
    }
    }


////

