package net.star.channel;

import java.util.ArrayList;
import java.util.List;

public abstract class CommunicationChannel {
    private String recipient;
    private List<String> recipients;

    public CommunicationChannel(String recipient) {
        this.recipient = recipient;
    }

    public CommunicationChannel(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getRecipient() {
        return recipient;
    }
    public List<String> getRecipients() {return recipients;}

    public abstract void sendInternally(String message);

    public void send(String message){
        if (message == null || message.isBlank()){
            return;
        }
        sendInternally(message);
    }
}
