package week6.Question1;

/*1. Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
    5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
*/
public class Liuda {


    public static boolean password_isValid(String password) {

        boolean validPasswordLength = password.length()>=5;
        boolean passwordNotContainsSpace = !password.contains(" ");
        boolean isPasswordContainsUppercaseLetter = !password.equals(password.toLowerCase());
        boolean isPasswordContainsLowercaseLetter = !password.equals(password.toUpperCase());
        int countDigit =0;
        int countSpecialChar =0;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))){         // char ch = password.charAt(i);
                countDigit++;
            }else if(!Character.isLetterOrDigit(password.charAt(i))){
                countSpecialChar++;
            }

        }
        return validPasswordLength && passwordNotContainsSpace && isPasswordContainsUppercaseLetter
                && isPasswordContainsLowercaseLetter && countDigit>0 && countSpecialChar>0 ;
    }
    public static void main(String[] args) {
        System.out.println("password_isValid = " + password_isValid("java#@1234Classic"));

    }

}
