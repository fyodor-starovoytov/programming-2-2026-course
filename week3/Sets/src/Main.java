void main() {
    List<Integer> list1 = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4);
    List<Integer> list2 = Arrays.asList(3, 4, 4, 4, 5, 6);

    // Union: [1, 2, 3, 4, 5, 6]
    Set<Integer> union = new HashSet<>();
    union.addAll(list1);
    union.addAll(list2);
    IO.println(union);

    // Intersection: [3, 4]
    Set<Integer> intersection = new HashSet<>();
    for (int i : list1){
       if (list2.contains(i)){
            intersection.add(i);
        }
    }
    IO.println(intersection);

    // Difference: [1, 2]
    Set<Integer> difference = new HashSet<>();
    for (int i : list1){
        if (!list2.contains(i)){
            difference.add(i);
        }
    }
    IO.println(difference);

    // Symmetric Difference: [1, 2, 5, 6]
    Set<Integer> symmetricDifference = new HashSet<>();
    for (int i : list1){
        if (!list2.contains(i)){
            symmetricDifference.add(i);
        }
    }
    for (int i : list2){
        if (!list1.contains(i)){
            symmetricDifference.add(i);
        }
    }
    IO.println(symmetricDifference);
}
