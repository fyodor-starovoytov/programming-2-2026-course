package net.star.message;

public class TextMessage extends Message{
    public TextMessage(String message) {
        super(message);
    }

    @Override
    protected void send() {
        IO.println("Sending text message: " + getMessage());
    }
}
