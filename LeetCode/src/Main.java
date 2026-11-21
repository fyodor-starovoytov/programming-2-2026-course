void main(){

    IO.println(isPalindrome(10));
    IO.println(isPalindrome(12110));
    IO.println(isPalindrome(11));
    IO.println(isPalindrome(121));

    IO.println(romanToInt("III"));
    IO.println(romanToInt("CIV"));
}

private boolean isPalindrome(int x) {
    //via string
    char[] y = Integer.toString(x).toCharArray();
    int len = y.length - 1;
    for (int i = 0; i <= len / 2; i++) {
        if (y[i] != y[len - i]) {
            return false;
        }
    }
    return true;
}

public int romanToInt(String s) {

    int oldX = 0;
    int sum = 0;
    int x = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
        switch (s.charAt(i)) {
            case 'I': x = 1; break;
            case 'V': x = 5; break;
            case 'X': x = 10; break;
            case 'L': x = 50; break;
            case 'C': x = 100; break;
            case 'D': x = 500; break;
            case 'M': x = 1000; break;
        }
        if (x < oldX) sum = sum - x;
        else sum = sum + x;
        oldX = x;
    }

    return sum;
}