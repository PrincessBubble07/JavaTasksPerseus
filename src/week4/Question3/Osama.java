package week4.Question3;
/*String -- Remove Duplicates
   Write a return method that can remove the duplicated values from
   String
   Ex: removeDup("AAABBBCCC") ==> ABC

    */
public class Osama {
    public static String removeDuplicate(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char each = str.toLowerCase().charAt(i);
            if (!result.contains(""+ each)) {
                result += each;
            }
        }
        return result;
    }



}
