package net.star.message;

public abstract class Message {
    private String message;
    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    protected abstract void send();
}
