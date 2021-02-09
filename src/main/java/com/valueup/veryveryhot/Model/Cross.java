package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;


public class Cross {
    private final int score;
    private final String category;


    @Id
    private String id;


    public Cross(@JsonProperty("score") int score, @JsonProperty("category") String category){
        this.score = score;
        this.category = category;
    }

    public int getScore(){
        return this.score;
    }

    public String getCategory(){
        return this.category;
    }

    public String getId(){
        return this.id;
    }
}
