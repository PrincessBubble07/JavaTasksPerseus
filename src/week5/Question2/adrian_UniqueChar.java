package week5.Question2;

public class adrian_UniqueChar {
    public static void main(String[] args) {
        String str ="aabcccd";
        String unique="";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += ch;
            }
        }

        System.out.println(unique);

    }
}
