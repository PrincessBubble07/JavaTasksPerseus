package week4.Question3;

public class adrian_RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aabbcccc";
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
    }
}




