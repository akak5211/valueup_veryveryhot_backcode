package com.valueup.veryveryhot.Model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Edu {
    private final String eduname;
    private final String eduurl;
    private final ArrayList<String> eduage;
    private final String eduimgurl;
    private final ArrayList<String> educategory;
    
    @Id
    private String id;

    public Edu(@JsonProperty("eduname") String eduname, @JsonProperty("eduurl") String eduurl, 
    @JsonProperty("eduage") ArrayList<String> eduage, @JsonProperty("eduimgurl") String eduimgurl,
    @JsonProperty("educategory") ArrayList<String> educategory){
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


    public ArrayList<String> getEduage() {
        return this.eduage;
    }

    public String getEduimgurl(){
        return this.eduimgurl;
    }

    public String getId() {
        return this.id;
    }

    public ArrayList<String> getEducategory() {
        return this.educategory;
    }
   
    
}
