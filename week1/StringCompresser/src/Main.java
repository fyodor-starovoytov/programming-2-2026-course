void main() {
    IO.println("compressString(\"aaaaAbbbccdaaaa\") => " + compressString("aaaaAbbbccdaaaa  "));
}

private static String compressString(String str) {
    /**
     * Compresses same characters of given string into "...character + amount_of_characters..."
     */
    if (str.isBlank()) {
        return "Nothing to compress";
    }
    StringBuilder compressed = new StringBuilder("");
    List<String> elements = Arrays.asList(str.split(""));

    int count = 0;
    int i = 0;
    while (i<elements.size()){
        String toDelete = elements.get(i);
        if (isSame(compressed.toString().split(""), toDelete) && !toDelete.isBlank()){
            if (count != 0){
                compressed.append(count);
                count = 0;
            }
            compressed.append(toDelete);
        }
        if (!toDelete.isBlank()) {
            count++;
        }
        i++;
    }
    compressed.append(count);
    return compressed.toString();
}

private static boolean isSame(String[] array, String string){
    /**
     * Checks whether the number is being counted right now.
     */
    if (array.length == 0){
        return false;
    }
    String element1 = array[array.length-1];

    if (element1.equals(string)){
        return false;
    }
    return true;
}
