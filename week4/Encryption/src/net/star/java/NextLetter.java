package net.star.java;

public class NextLetter implements Encryptor {

    @Override
    public String encrypt(String message) {
        if (message == null || message.isBlank()){
            return "";
        }

        StringBuilder encryptedMessage = new StringBuilder();
        char[] characters = message.toCharArray();
        for (char c : characters){
            c++;
            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
    }

    @Override
    public String decrypt(String encryptedMessage) {
        if (encryptedMessage == null || encryptedMessage.isBlank()){
            return "";
        }

        StringBuilder message = new StringBuilder();
        char[] characters = encryptedMessage.toCharArray();
        for (char c : characters){
            c--;
            message.append(c);
        }
        return message.toString();
    }
}