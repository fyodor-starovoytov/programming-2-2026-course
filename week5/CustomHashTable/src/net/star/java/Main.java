import net.star.java.HashTable;

void main() {
    HashTable<Integer, String> hashTable = new HashTable<>(10);
    HashTable<String, String> hashTableString = new HashTable<>(10);

    hashTableString.add("Apple", "red");
    IO.println(hashTableString.get("Apple"));
    hashTableString.add("Apple", "purple");
    hashTableString.remove("Apple");
    IO.println(hashTableString.get("Apple"));


       int numberOfElementsToAdd = 1000;

    for (int i = 0; i < numberOfElementsToAdd; i++) {
        hashTable.add(i, String.valueOf(i));
    }

    for (int i = 0; i < numberOfElementsToAdd; i++) {
        if (hashTable.get(i) == null) {
            IO.println(String.format("Error! Element %s has disappeared!", i));
            return;
        }
    }

    IO.println("All elements can be found in the collection.");
}