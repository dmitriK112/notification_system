package com.example.notifiksys;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PushNotification implements NotificationService {
    private final MessageFormatter messageFormatter;

    public PushNotification(@Qualifier("upperCase") MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    @Override
    public String send(String message){
        message = messageFormatter.format(message);
        return "Posielam Push-notifikaciu: "+ message;
    }
}
