package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;


public class Cross {
    private final String crossurl;
    private final String imgurl;


    @Id
    private String id;


    public Cross(@JsonProperty("crossurl") String crossurl, @JsonProperty("imgurl") String imgurl){
        this.crossurl = crossurl;
        this.imgurl = imgurl;
    }

    public String getCrossurl(){
        return this.crossurl;
    }

    public String getImgurl(){
        return this.imgurl;
    }

    public String getId(){
        return this.id;
    }
}
