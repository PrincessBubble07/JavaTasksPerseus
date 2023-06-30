package week4.Question3;

public class Benjamin {
    public static void main(String[] args) {


        String str = "AAAAAABBBBBBBBCCCCCCDDDDDFFEE";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains("" + str.charAt(i))) {
                continue;

            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

   /*String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> ABC

     */