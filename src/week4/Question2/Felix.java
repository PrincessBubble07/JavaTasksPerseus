package week4.Question2;

public class Felix {

    public static boolean method2(String str1,String str2){

        boolean answer = true;

        if (str1.length()!=str2.length())
            answer=false;

        for (int i = 0; i < str1.length(); i++) {

            if (str1.contains(""+str2.charAt(i))){
                answer=true;
            }else {
                answer=false;
            }

        }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(method2("abc", "baa"));
    }

}
/*
    String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */