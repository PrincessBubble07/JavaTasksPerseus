package week6.Question1;

public class Osama {
    public static boolean isValidPassword(String password) {
        if (password.length() < 6||password.contains(" ")){
            return false;
        }

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        for (int i = 0; i < password.length(); ++i) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                hasUpper = true;
            } else if (Character.isLowerCase(ch)){
                hasLower = true;
            } else if (Character.isDigit(ch)){
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)){
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower  && hasDigit && hasSpecial;

    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("wz89@q"));
    }
}


