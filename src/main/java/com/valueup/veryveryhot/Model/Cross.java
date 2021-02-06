package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;


public class Cross {
    private final String crossurl;


    @Id
    private String id;


    public Cross(@JsonProperty("crossurl") String crossurl){
        this.crossurl = crossurl;
    }

    public String getCrossurl(){
        return this.crossurl;
    }

    public String getId(){
        return this.id;
    }
}
