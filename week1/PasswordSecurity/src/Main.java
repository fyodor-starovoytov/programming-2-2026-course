
void main() {
    String examplePassword1 = "1234";
    IO.println("Is strong password? (" + examplePassword1 + ") -> " + isPasswordStrong(examplePassword1));
    String examplePassword2 = "0kko!DEM";
    IO.println("Is strong password? (" + examplePassword2 + ") -> " + isPasswordStrong(examplePassword2));
}

/**
 * Method checks if the given string is a strong enough as a password.
 */
boolean isPasswordStrong(String password) {
    int minPasswordLength = 8;
    if (password.length() < minPasswordLength){
        return false;
    }

    int passwordStrengthScale = 0;
    int minDigitCount = 1;
    int minUpperCount = 1;
    int minLowerCount = 1;
    int neededPasswordStrengthScale = minDigitCount + minUpperCount + minLowerCount;

    char[] lst = password.toCharArray();
    for (Character ch : lst){
        if (Character.isDigit(ch)){
            passwordStrengthScale = passwordStrengthScale + minDigitCount;
            if (minDigitCount > 0) {minDigitCount--;}
        }
        if (Character.isUpperCase(ch)){
            passwordStrengthScale = passwordStrengthScale + minUpperCount;
            if (minUpperCount > 0) {minUpperCount--;}
        }
        if (Character.isLowerCase(ch)){
            passwordStrengthScale = passwordStrengthScale + minLowerCount;
            if (minLowerCount > 0) {minLowerCount--;}
        }
    }

    return passwordStrengthScale >= neededPasswordStrengthScale;
}

