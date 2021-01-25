package com.valueup.veryveryhot.FCM;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FCMController {
    
    @Autowired
    private final FirebaseCloudMessageService firebaseCloudMessageService;

    public FCMController(FirebaseCloudMessageService firebaseCloudMessageService) {
        this.firebaseCloudMessageService = firebaseCloudMessageService;
    }

    @RequestMapping("api/v1/fcm")
    public void message(String targetToken, String title, String body) {

        try {
            firebaseCloudMessageService.sendMessageTo(targetToken, title, body);;
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
}
