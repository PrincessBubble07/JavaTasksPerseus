package week6.Question1;

public class Madeleine {

    public static boolean validatePassword(String password) {
        int minLength = 6; // minimum length for password
        boolean hasUppercase = false; // check for uppercase letters
        boolean hasLowercase = false; // check for lowercase letters
        boolean hasDigit = false; // check for digits
        boolean hasSpecialChar = false; //check for special char

        if (password.length() < minLength) {
            return false; // password is too short
        }
        if (password.contains(" ")) {
            return false; // password contains a space
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }

            if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
                return true; // password meets the requirements
            }
        }
        return false;
    }












}
