package week6.Question1;

public class Felix {

    public static boolean validPassword(String password){

        if (password.contains(" "))
            return false;

        if (password.length()<6)
            return false;

        int uppercase=0,lowercase=0,digit=0;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i)))
                uppercase++;
            if (Character.isLowerCase(password.charAt(i)))
                lowercase++;
            if (Character.isDigit(password.charAt(i)))
                digit++;
        }
        if (password.length()==(uppercase+lowercase+digit))
            return false;

        return true;

    }


    public static void main(String[] args) {
        System.out.println(validPassword("Aa111."));
    }
}
    /*
    Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
  5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
     */


