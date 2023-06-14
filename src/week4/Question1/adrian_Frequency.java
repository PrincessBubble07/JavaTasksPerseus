package week4.Question1;

public class adrian_Frequency {
        public static void main(String[] args) {

            String str = "aaaddddrrrrriiiiiiaaaaaaaannnnnnnnnn";
            String result ="";

            for (int j = 0; j < str.length(); j++) {


                int frequency = 0;
                char ch = str.charAt(j);
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch) {
                        frequency++;

                    }
                }
                if (result.contains(""+ch)){
                    continue;
                }
                result+= ch +""+ frequency;
            }
            System.out.println(result);

        }
    }


