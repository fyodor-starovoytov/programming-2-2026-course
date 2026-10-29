void main() {
    for (int i = 1; i <= 100; i++){
        if (isPrime(i)){
            IO.println(i);
        }
    }
}

boolean isPrime(int x) {
    if (x <= 1){
        return false;
    }

    for (int i = 2; i * i <= x; i++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}
