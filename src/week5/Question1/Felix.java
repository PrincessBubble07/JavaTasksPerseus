package week5.Question1;

public class Felix {

    public static String method1(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch==str.charAt(j)){
                    count++;
                    }
                }
            if (count==1){
                answer+=ch;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(method1("aaabbbcccddefgh"));
    }
}
/*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */