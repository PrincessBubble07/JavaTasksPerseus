package src.week4.Question3;

public class madeleine {


    public static String removeDup(String str){
        // String str = "xyzxyzxyz";

        String result ="";

        for (int i = 0; i < str.length(); i++) {

            if(result.contains(""+str.charAt(i))){ //if the character is already contained in new string, it will be skipped
                continue;
            }
            result+=str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {


        System.out.println(removeDup("mississippi"));


    }



}
