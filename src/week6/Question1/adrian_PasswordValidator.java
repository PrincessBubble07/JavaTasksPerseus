package week6.Question1;

public class adrian_PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Check the length of the password
        if (password.length() < 6) {
            return false;
        }

        // Check if the password contains a space
        if (password.contains(" ")) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if the password contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check if the password contains at least one special character
        if (!password.matches(".*[@#$%^&+=].*")) {
            return false;
        }

        // Check if the password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // If all requirements are met, return true
        return true;
    }

    public static void main(String[] args) {
        String password = "Abc@123";
        boolean isValid = isValidPassword(password);
        System.out.println("Is the password valid? " + isValid);
    }
}

