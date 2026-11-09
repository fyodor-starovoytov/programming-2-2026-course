void main() {
    List<Integer> t1 = new ArrayList<>(List.of(3, 5, -1, 7));
    List<Double> t2 = new ArrayList<>(List.of(0.0, -1.0, 2.5, 7.7));
    List<Character> t3 = new ArrayList<>(List.of('a', 'b', 'C'));
    List<String> t4 = new ArrayList<>(List.of("Kissa", "Koira", "Hamsteri", "Puudeli"));

    IO.println(findLargest(t1));
    IO.println(findLargest(t2));
    IO.println(findLargest(t3));
    IO.println(findLargest(t4));
}

private <T extends Comparable<T>> T findLargest(List<T> items){
    T largest = items.getFirst();
    for (T item : items){
        if (largest.compareTo(item) <= -1){
            largest = item;
        }
    }

    return largest;
}