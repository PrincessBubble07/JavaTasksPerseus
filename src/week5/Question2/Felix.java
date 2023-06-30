package week5.Question2;

public class Felix {

    public static String method2(String str){

        String answer = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            answer+=str.charAt(i);

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(method2("XILEF"));
    }

}
/*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */