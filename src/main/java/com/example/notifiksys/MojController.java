package com.example.notifiksys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class MojController {

    private NotificationService emailService;
    private NotificationService smsService;
    private NotificationService pushService;

    @Autowired
    public MojController(@Qualifier("emailNotification") NotificationService emailService,
    @Qualifier("SMSNotification") NotificationService smsService,
    @Qualifier("pushNotification")  NotificationService pushService){
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;
    }

    @GetMapping("/notify/email")
    public String sendEmailNotification() {
        return emailService.send("Pouzivatel sa prihlasil");
    }

    @GetMapping("/notify/sms")
    public String sendSMSNotification() {
        return smsService.send("Pouzivatel sa prihlasil");
    }

    @GetMapping("notify/push")
    public String sendPushNotification() {
        return pushService.send("Pouzivatel sa prihlasil");
    }

}
