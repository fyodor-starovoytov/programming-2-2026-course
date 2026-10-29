void main() {
    int[] input = generateInput(10);
    IO.println(Arrays.toString(input));
    IO.println("Missing number: " + missingNumber(input));
}

private static int missingNumber(int[] array){
    if (array.length < 1){
        return 1;
    }

    int n = array.length;

    for (int i = 1; i <= n; i++) {
        boolean exists = false;
        for (int pos : array) {
            if (pos == i){
                exists = true;
            };
        }
        if (!exists){
            return i;
        }
    }
    return n+1;
}

private static int[] generateInput(int maxNumber) {
    Random r = new Random();
    List<Integer> numbers = new ArrayList<>(IntStream.range(1, r.nextInt(2, maxNumber + 1)).boxed().toList());
    Collections.shuffle(numbers);
    numbers.remove(r.nextInt(numbers.size()));
    return numbers.stream().mapToInt(Integer::intValue).toArray();
}