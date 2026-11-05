package net.star.message;

public class Email extends Message{
    public Email(String message) {
        super(message);
    }

    @Override
    protected void send() {
        IO.println("Sending email: " + getMessage());
    }
}
