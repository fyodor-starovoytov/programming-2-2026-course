void main(){

   IO.println(isPalindrome(10));
   IO.println(isPalindrome(12110));
   IO.println(isPalindrome(11));
   IO.println(isPalindrome(121));

   IO.println(romanToInt("III"));
   IO.println(romanToInt("CIV"));

    IO.println(isValid("()"));
    IO.println(isValid("(("));
    IO.println(isValid("()[]({})"));

    LinkedList<Integer> sortedLinkedList0 = new LinkedList<>(List.of(1, 2, 6));
    LinkedList<Integer> sortedLinkedList1 = new LinkedList<>(List.of(2, 5, 8));
    IO.println(mergeTwoLists(sortedLinkedList0, sortedLinkedList1));
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

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * */
public boolean isValid(String s) {
    if ((s.length() % 2) != 0){
        return false;
    }

    boolean isOpenBracket;
    Stack<Character> brackets = new Stack<>();
    for (char c : s.toCharArray()) {

        isOpenBracket = switch (c) {
            case ')', '}', ']' -> false;
            default -> true;
        };

        if (isOpenBracket) {
            brackets.push(c);
            continue;
        }

        if (brackets.isEmpty()) {
            return false;
        }

        if (c == ')') c = '(';
        if (c == ']') c = '[';
        if (c == '}') c = '{';
        if (brackets.pop() != c){
            return false;
        }
    }

    return brackets.isEmpty();
}

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * */
public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
    for (int i = 0; i < list1.size() + list1.size(); i++) {

    }
    
}