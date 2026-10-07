package com.example.notifiksys;

import org.springframework.stereotype.Component;

@Component
public class UpperCase implements MessageFormatter {
    @Override
    public String format(String message) {
        return message.toUpperCase();
    }
}
