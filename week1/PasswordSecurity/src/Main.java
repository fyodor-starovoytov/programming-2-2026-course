
void main() {
    String examplePassword1 = "1234";
    IO.println("Is strong password? (" + examplePassword1 + ") -> " + isPasswordStrong(examplePassword1));
    String examplePassword2 = "0kko!DEM";
    IO.println("Is strong password? (" + examplePassword2 + ") -> " + isPasswordStrong(examplePassword2));
}

/**
 * Checks the strength of a password.
 * A password is considered strong if:
 * <p>
 * - It contains at least 8 characters
 * - It contains at least one digit
 * - It contains at least one uppercase and one lowercase letter
 *
 * @param password The password to check
 * @return True if the password meets the requirements, otherwise false.
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

    for (Character ch : password.toCharArray()){
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

