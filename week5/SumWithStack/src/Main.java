//TODO: 1 + 2 + ... + n without recursion
void main() {
    IO.println(sumIteratively(5) == 15);
    IO.println(sumIteratively(4) == 10);
    IO.println(sumIteratively(3) == 6);
    IO.println(sumIteratively(2) == 3);
    IO.println(sumIteratively(1) == 1);
    IO.println(sumIteratively(0) == 0);
}

public int sumIteratively(int n){
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    for (int i = n; i > 0; i--) {
        stack.push(i);
    }

    int sum = 0;
    while (!stack.isEmpty()){
        sum = sum + stack.pop();
    }

    return sum;
}
