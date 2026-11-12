void main() {
    String text = "One cat on sofa, one cat running. Cat also in kitchen kitchen.";

    Consumer<String> countWords = a -> {
        Map<String, Integer> words = new HashMap<>();
        int common = 0;
        String commonKey = null;

        a = a.toLowerCase().replaceAll("[,.?!]","");
        for (String word : a.split(" ")){
            if (words.containsKey(word)){
                words.put(word, words.get(word) + 1);
                continue;
            }

            words.put(word, 1);
        }

        for (String key : words.keySet()){
            IO.println(key + ": " + words.get(key));

            if (words.get(key) > common){
                common = words.get(key);
                commonKey = key;
            }

        }

        IO.println("\nMost common word: " + commonKey + " (" + (common) + ")\n"
                + "Unique words: " + words.size());
    };
    countWords.accept(text);

}
