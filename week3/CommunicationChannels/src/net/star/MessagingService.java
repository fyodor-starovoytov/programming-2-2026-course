package net.star;

import net.star.channel.CommunicationChannel;

import java.util.ArrayList;
import java.util.List;

public class MessagingService {
    public List<CommunicationChannel> channels;
    public MessagingService() {
        this.channels = new ArrayList<>();
    }

    public void addChannel(CommunicationChannel channel) {
        channels.add(channel);
    }

    public void sendToAll(String message){
        for (CommunicationChannel channel : channels){
            channel.send(message);
        }
    }
}
