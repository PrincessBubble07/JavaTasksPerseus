package week6.Question1;

public class Elizabeth {
    public boolean StrongPasswordChecker(String password) {


        // Password Validation Task:
        //  Write a return method that can verify if a password is valid or not. Requirements:
        //    1. Password MUST be at least have 6 characters and should not contain space,
        //    2. Password should at least contain one upper case letter,
        //    3. PassWord should at least contain one lowercase letter,
        //    4. Password should at least contain one special characters,
        //  5. Password should at least contain a digit.
        //
        //if all requirements above are met, the method returns true, otherwise returns false.


        if (password.length() < 6) return false;

        //create variable for all condition
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpec = false;


        for (int i = 0; i < password.length(); ++i) {
            //get char at ith position
            char c = password.charAt(i);

            //check for upper case letter
            if ('A' <= c && c <= 'Z') hasUpper = true;
                //check for lower case letter
            else if ('a' <= c && c <= 'z') hasLower = true;
                //check for digit letter
            else if ('0' <= c && c <= '9') hasDigit = true;
                //check for special char letrer
            else if ("!@#$%^&*()-+".contains(c + "")) hasSpec = true;
                //check it is space or not
            else if (c == ' ')
                return false;

        }
        return hasUpper && hasLower && hasDigit && hasSpec;
    }
}
