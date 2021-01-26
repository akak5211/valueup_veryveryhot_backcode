package com.valueup.veryveryhot.FCM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

import org.springframework.http.HttpEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AndroidPushNotificationsService {
	private static final String firebase_api_url="https://fcm.googleapis.com/fcm/send";
	
	// private String getAccessToken() throws IOException {
	// 	        String firebaseConfigPath = "firebase/firebase_service_key.json";
		
	// 	        GoogleCredentials googleCredentials = GoogleCredentials
	// 	                .fromStream(new ClassPathResource(firebaseConfigPath).getInputStream())
	// 	                .createScoped(List.of("https://www.googleapis.com/auth/cloud-platform"));
		
	// 	        googleCredentials.refreshIfExpired();
	// 	        return googleCredentials.getAccessToken().getTokenValue();
	// 	    }

    @Async
    public CompletableFuture<String> send(HttpEntity<String> entity) throws IOException{

        RestTemplate restTemplate = new RestTemplate();

        ArrayList<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();

		interceptors.add(new HeaderRequestInterceptor("Authorization", "key=" + ""));
        interceptors.add(new HeaderRequestInterceptor("Content-Type", "application/json; UTF-8 "));
        restTemplate.setInterceptors(interceptors);

        String firebaseResponse = restTemplate.postForObject(firebase_api_url, entity, String.class);

        return CompletableFuture.completedFuture(firebaseResponse);
    }
}
