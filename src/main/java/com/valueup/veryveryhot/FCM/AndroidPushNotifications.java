package com.valueup.veryveryhot.FCM;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AndroidPushNotifications {

    public static String NewCommentNotificationJson(List<String> tokens, String qnatitle) throws JSONException {

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
        try{
            title = URLEncoder.encode(title, "UTF-8");
            qnatitle = URLEncoder.encode("글 제목:" + qnatitle, "UTF-8");
            notification.put("title", title);
            notification.put("body", qnatitle);

        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }

        body.put("notification", notification);

        System.out.println(body.toString());

        return body.toString();
    }
}
