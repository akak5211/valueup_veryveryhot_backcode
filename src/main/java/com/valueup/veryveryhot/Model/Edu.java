package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Edu {
    private final String eduname;
    private final String eduurl;
    private final String eduage;
    private final String eduimgurl;
    private final String educategory;
    
    @Id
    private String id;

    public Edu(@JsonProperty("eduname") String eduname, @JsonProperty("eduurl") String eduurl, 
    @JsonProperty("eduage") String eduage, @JsonProperty("eduimgurl") String eduimgurl,
    @JsonProperty("educategory") String educategory){
        this.eduname = eduname;
        this.eduurl = eduurl;
        this.eduage = eduage;
        this.eduimgurl = eduimgurl;
        this.educategory = educategory;
    }

    public String getEduname() {
        return this.eduname;
    }


    public String getEduurl() {
        return this.eduurl;
    }


    public String getEduage() {
        return this.eduage;
    }

    public String getEduimgurl(){
        return this.eduimgurl;
    }

    public String getId() {
        return this.id;
    }

    public String getEducategory() {
        return this.educategory;
    }
   
    
}
