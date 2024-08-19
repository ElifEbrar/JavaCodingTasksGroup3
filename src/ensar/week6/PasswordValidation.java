package ensar.week6;

public class PasswordValidation {
    
    public static void main(String[] args) {
        String givenPassword = "Password#1234";

        System.out.println(isValid(givenPassword));
    }
    
    private static boolean isValid(String pass) {
        boolean isLong      = pass.length() > 5;
        boolean hasSpace    = pass.contains(" ");
        boolean hasUpper    = false;
        boolean hasLower    = false;
        boolean hasSpecial  = false;
        boolean hasDigit    = false;

        for (char eachLetter : pass.toCharArray()) {
            if (Character.isUpperCase(eachLetter)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(eachLetter)) {
                hasLower = true;
            }
            if (!Character.isLetterOrDigit(eachLetter)) {
                hasSpecial = true;
            }
            if (Character.isDigit(eachLetter)) {
                hasDigit = true;
            }
        }
                
        return isLong && !hasSpace && hasUpper && hasLower && hasSpecial && hasDigit;
    }
    
}
