package net.star.channel;

import java.util.ArrayList;
import java.util.List;

public class TextMessage extends CommunicationChannel {
    private final int CHARACTER_LIMIT;

    public TextMessage(String recipient) {
        super(recipient);
        CHARACTER_LIMIT = Integer.MAX_VALUE;
    }

    public TextMessage(List<String> recipients, int character_limit) {
        super(recipients);
        this.CHARACTER_LIMIT = character_limit;
    }

    @Override
    public void sendInternally(String message) {
        if (getRecipients() != null && !getRecipients().isEmpty()) {
            for (String recipient : getRecipients()) {
                if (message.length() > CHARACTER_LIMIT) {
                    List<String> splitMessages = new ArrayList<>();

                    StringBuilder remainder = new StringBuilder(message);
                    while (remainder.length() > 80) {
                        String subMessage = remainder.substring(0, CHARACTER_LIMIT);
                        splitMessages.add(subMessage);
                        remainder.delete(0, CHARACTER_LIMIT);
                    }

                    for (String msg : splitMessages) {
                        IO.println("Sending text message to " + recipient + ": " + msg);
                    }

                } else {
                    IO.println("Sending text message to " + recipient + ": " + message);
                }
            }
        } else {
            if (message.length() > CHARACTER_LIMIT) {
                List<String> splitMessages = new ArrayList<>();

                StringBuilder remainder = new StringBuilder(message);
                while (remainder.length() > 80) {
                    String subMessage = remainder.substring(0, CHARACTER_LIMIT);
                    splitMessages.add(subMessage);
                    remainder.delete(0, CHARACTER_LIMIT);
                }

                for (String msg : splitMessages) {
                    IO.println("Sending text message to " + getRecipient() + ": " + msg);
                }

            } else {
                IO.println("Sending text message to " + getRecipient() + ": " + message);
            }
        }
    }
}
