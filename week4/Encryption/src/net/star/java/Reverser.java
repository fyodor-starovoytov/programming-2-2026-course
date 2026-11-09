package net.star.java;

public class Reverser implements Encryptor{
    @Override
    public String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    @Override
    public String decrypt(String encryptedMessage) {
        return new StringBuilder(encryptedMessage).reverse().toString();
    }
}
