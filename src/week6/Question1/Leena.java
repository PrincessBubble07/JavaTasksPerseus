package week6.Question1;

public class Leena {
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
        public static boolean validatePassword(String password) {
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;

            // Iterate over each character in the password
            for (char c : password.toCharArray()) {
                if (c == ' ') {
                    return false; // Requirement 1: Password should not contain space
                } else if (Character.isUpperCase(c)) {
                    hasUppercase = true; // Requirement 2: Password should contain at least one uppercase letter
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true; // Requirement 3: Password should contain at least one lowercase letter
                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar = true; // Requirement 4: Password should contain at least one special character
                } else if (Character.isDigit(c)) {
                    hasDigit = true; // Requirement 5: Password should contain at least one digit
                }
            }

            // Check if all requirements are met
            return password.length() >= 6 && hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
        }

    public static boolean validPassword(String password) {

        if ((password.length() < 6) ||
                (password.contains(" ")) ||
                (!password.matches(".*[A-Z].*")) ||
                (!password.matches(".*[a-z].*")) ||
                (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) ||
                (!password.matches(".*\\d.*"))) {
            return false;
        }
        return true; // if all requirements are met
    }
    }


