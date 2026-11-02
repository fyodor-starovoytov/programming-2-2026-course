package net.star.channel;

import java.util.List;

public class Email extends CommunicationChannel{
    public Email(String recipient) {
        super(recipient);
    }

    public Email(List<String> recipients) {
        super(recipients);
    }

    @Override
    public void sendInternally(String message) {
        if (getRecipients() != null && !getRecipients().isEmpty()){
            for (String recipient : getRecipients()){
                IO.println("Sending email to " + recipient + ": " + message);
            }
        }
        else {
            IO.println("Sending email to " + getRecipient() + ": " + message);
        }
    }
}
