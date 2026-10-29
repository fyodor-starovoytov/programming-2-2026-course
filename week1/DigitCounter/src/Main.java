//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    while (true) {
        IO.println("Give me an integer: ");
        String userInput = IO.readln();

        if (userInput.isBlank()){
            break;
        }

        Map<Integer, Integer> digitMap = countDigits(userInput);

        if (digitMap.isEmpty()) {
            break;
        }

        for (Map.Entry<Integer, Integer> entry : digitMap.entrySet()) {
            //"%[flags][width]conversion : %[flags][width]conversion", 1. string, 2. string
            //%-15s - 15 indentions
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue() + " pcs");
        }
    }
}

private static Map<Integer, Integer> countDigits(String string){
    Map<Integer, Integer> digitMap = new HashMap<>();

    try {
        for (String s : string.split("")) {
            int digit = Integer.parseInt(s);

            if (!digitMap.containsKey(digit)) {
                digitMap.put(digit, 1);
            } else {
                digitMap.put(digit, digitMap.get(digit) + 1);
            }
        }
    } catch (NumberFormatException e) {
        IO.println("Error: " + e);
    }

    return digitMap;
}
