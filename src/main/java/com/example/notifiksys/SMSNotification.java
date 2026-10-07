package com.example.notifiksys;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements NotificationService{
    private final MessageFormatter messageFormatter;

    public SMSNotification(@Qualifier("plainText") MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }
    @Override
    public String send(String message) {
        String formattedMessage = messageFormatter.format(message);
        return "Posielam spravu pomocou SMS: "+formattedMessage;
    }
}
