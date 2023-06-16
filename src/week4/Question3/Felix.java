package week4.Question3;

public class Felix {

    public static void method3(String str){

        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            if (!answer.contains(str.charAt(i)+"")){
                answer+=str.charAt(i);
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {

        method3("AAABBBCCC");

    }

}
/*String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC

     */