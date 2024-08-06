package Akif.week6;

public class PasswordValidator {
    // Main method for testing the password validation
    public static void main(String[] args) {
        // Test the isValidPassword method
        String[] testPasswords = {"Password1!", "P@ssw0", "Pass1", "password1!", "PASSWORD1!", "P@ss word1"};

        for (String password : testPasswords) {
            System.out.println("Password: " + password + " is valid: " + isValidPassword(password));
        }
    }
    // Method to validate password
    public static boolean isValidPassword(String password) {
        // Check if password is at least 6 characters long and does not contain spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Loop through each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        // Check if all conditions are met
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
    /*1. Write a return method that can verify if a password is valid or not.
    requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper-case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special character
        5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false write code on java */

}
