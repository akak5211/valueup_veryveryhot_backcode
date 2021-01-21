package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Like{
    private final String likepeople;
    private final String parentqnaid;


@Id
private String id;

public Like(@JsonProperty("likepeople") String likepeople, @JsonProperty("parentqnaid") String parentqnaid){
    this.likepeople = likepeople;
    this.parentqnaid = parentqnaid;
}



    public String getLikepeople() {
        return this.likepeople;
    }


    public String getParentqnaid() {
        return this.parentqnaid;
    }

    
    public String getId(){
        return this.id;
    }
    
}