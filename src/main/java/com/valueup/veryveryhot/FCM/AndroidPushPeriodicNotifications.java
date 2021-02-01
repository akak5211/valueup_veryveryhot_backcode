package com.valueup.veryveryhot.FCM;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AndroidPushPeriodicNotifications {

    public static String PeriodicNotificationJson(List<String> tokens, String qnatitle) throws JSONException {

        JSONObject body = new JSONObject();

        List<String> tokenlist = new ArrayList<String>();

        for(int i=0; i<tokens.size(); i++){
            tokenlist.add(tokens.get(i));
        }

        JSONArray array = new JSONArray();

        for(int i=0; i<tokenlist.size(); i++) {
            array.put(tokenlist.get(i));
        }

        body.put("registration_ids", array);

        JSONObject notification = new JSONObject();
        String title = "새로운 댓글이 달렸습니다.";
        byte[] titleByte;
        byte[] bodyByte;
        try{
            titleByte = title.getBytes("UTF-8");
            bodyByte = qnatitle.getBytes("UTF-8");
            notification.put("title", titleByte);
            notification.put("body", bodyByte);

        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }

        body.put("notification", notification);

        System.out.println(body.toString());

        return body.toString();
    }
}
