package com.valueup.veryveryhot.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;

public class Cardinfo {

    private final String name;
    private final String companyname;
    private final String img;
    private final String anuual_free;
    private final String desc;
    private final List<String> rewards;
    private final List<String> rewards_img;

    @Id
    private String id;

    public Cardinfo(@JsonProperty("name") String name, @JsonProperty("companyname") String companyname, @JsonProperty("img") String img,  
    @JsonProperty("anuual_free") String anuual_free, @JsonProperty("desc") String desc, 
    @JsonProperty("rewards") List<String> rewards, @JsonProperty("rewards_img") List<String> rewards_img) {
        this.name = name;
        this.companyname = companyname;
        this.img = img;
        this.anuual_free = anuual_free;
        this.desc = desc;
        this.rewards = rewards;
        this.rewards_img = rewards_img;
     
    }
      

    public String getName() {
        return this.name;
    }


    public String getCompanyname() {
        return this.companyname;
    }


    public String getImg() {
        return this.img;
    }


    public String getAnuual_free() {
        return this.anuual_free;
    }


    public String getDesc() {
        return this.desc;
    }


    public List<String> getRewards() {
        return this.rewards;
    }


    public List<String> getRewards_img() {
        return this.rewards_img;
    }


    public String getId() {
        return this.id;
    }

}
