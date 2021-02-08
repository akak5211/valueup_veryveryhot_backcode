package com.valueup.veryveryhot.FCM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.valueup.veryveryhot.Model.Qna;
import com.valueup.veryveryhot.Model.User;
import com.valueup.veryveryhot.Service.QnaService;
import com.valueup.veryveryhot.Service.UserService;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AndroidPushNotificationsService androidPushNotificationsService;

    @Autowired
    UserService userService;

    @Autowired
    QnaService qnaService;

    @PostMapping(value = "api/v1/fcm/send", produces = "text/plain;charset=UTF-8")
    public @ResponseBody ResponseEntity<String> send(@RequestBody HashMap<String, Object> paramInfo) throws JSONException, InterruptedException {

        String qnaid = paramInfo.get("qnaid").toString();
        Qna qna = qnaService.getQna(qnaid);
        String qnatitle = qna.getQnatitle();
        List<String> likepeoplelist = new ArrayList<>();
        List<String> commentpeoplelist = new ArrayList<>();
        List<String> notificationpeoplelist = new ArrayList<>();

        List<String> tokens = new ArrayList<>();

        likepeoplelist = qna.getLikepeople();
        commentpeoplelist = qna.getCommentpeople();
        notificationpeoplelist.addAll(likepeoplelist);
        for (int i = 0; i < commentpeoplelist.size(); i++){
            if(!notificationpeoplelist.contains(commentpeoplelist.get(i))){
                notificationpeoplelist.add(commentpeoplelist.get(i));
            }
        }
        for (int i = 0; i <notificationpeoplelist.size(); i++){
            String token = userService.getUserByUserid(notificationpeoplelist.get(i)).getToken();
            tokens.add(token);
        }

        String notifications = AndroidPushNotifications.NewCommentNotificationJson(tokens, qnatitle);

        HttpEntity<String> request = new HttpEntity<>(notifications);

        try{
            CompletableFuture<String> pushNotification = androidPushNotificationsService.send(request);
            CompletableFuture.allOf(pushNotification).join();
    
            String firebaseResponse = pushNotification.get();
            return new ResponseEntity<>(firebaseResponse, HttpStatus.OK);
        }catch (IOException e) {
            e.printStackTrace();
        }

        catch (InterruptedException e){
            logger.debug("got interrupted!");
            throw new InterruptedException();
        }
        catch (ExecutionException e){
            logger.debug("execution error!");
        }

        return new ResponseEntity<>("Push Notification ERROR!", HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value = "api/v1/fcm/daily", produces = "text/plain;charset=UTF-8")
    public @ResponseBody ResponseEntity<String> daily(@RequestBody HashMap<String, Object> paramInfo) throws JSONException, InterruptedException {

        String newstitle = paramInfo.get("newstitle").toString();

        List<String> tokens = new ArrayList<>();
        List<User> users = new ArrayList<>();
        users = userService.getAllUsers();

        for (int i = 0; i <users.size(); i++){
            String token = users.get(i).getToken();
            tokens.add(token);
        }

        String notifications = AndroidPushNotifications.DailyNotificationJson(tokens, newstitle);

        HttpEntity<String> request = new HttpEntity<>(notifications);

        try{
            CompletableFuture<String> pushNotification = androidPushNotificationsService.send(request);
            CompletableFuture.allOf(pushNotification).join();
    
            String firebaseResponse = pushNotification.get();
            return new ResponseEntity<>(firebaseResponse, HttpStatus.OK);
        }catch (IOException e) {
            e.printStackTrace();
        }

        catch (InterruptedException e){
            logger.debug("got interrupted!");
            throw new InterruptedException();
        }
        catch (ExecutionException e){
            logger.debug("execution error!");
        }

        return new ResponseEntity<>("Push Notification ERROR!", HttpStatus.BAD_REQUEST);
    }
}
