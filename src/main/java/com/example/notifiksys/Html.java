package com.example.notifiksys;

import org.springframework.stereotype.Component;

@Component
public class Html implements MessageFormatter {
    @Override
    public String format(String message) {
        return "<html><body><h2>" + message + "</h2></body></html>";
    }

}
