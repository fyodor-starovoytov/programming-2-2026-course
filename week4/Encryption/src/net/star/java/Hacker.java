package net.star.java;

import java.util.HashMap;
import java.util.Map;

public class Hacker implements Encryptor{
    @Override
    public String encrypt(String message) {
        if (message == null || message.isBlank()){
            return "";
        }

        Map<Character, Character> chars = new HashMap<>();
        chars.put('a', '@');
        chars.put('A', '@');
        chars.put('e', '3');
        chars.put('i', '!');
        chars.put('o', '0');

        StringBuilder encryptedMessage = new StringBuilder();
        char[] characters = message.toCharArray();
        for (char c : characters){
            if (chars.containsKey(c)){
                encryptedMessage.append(chars.get(c));
                continue;
            }

            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
    }

    @Override
    public String decrypt(String encryptedMessage) {
        if (encryptedMessage == null || encryptedMessage.isBlank()){
            return "";
        }

        Map<Character, Character> chars = new HashMap<>();
        chars.put('@', 'a');
        chars.put('3', 'e');
        chars.put('!', 'i');
        chars.put('0', 'o');

        StringBuilder message = new StringBuilder();
        char[] characters = encryptedMessage.toCharArray();
        for (char c : characters){
            if (chars.containsKey(c)){
                message.append(chars.get(c));
                continue;
            }

            message.append(c);
        }
        return message.toString();
    }
}
