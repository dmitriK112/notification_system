package com.example.notifiksys;

import org.springframework.stereotype.Component;

@Component
public class PlainText implements MessageFormatter {
    @Override
    public String format(String message) {
        return message;
    }
}
