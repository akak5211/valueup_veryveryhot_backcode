package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Edu {
    private final String eduname;
    private final String eduurl;
    private final String eduage;
    
    @Id
    private String id;

    public Edu(@JsonProperty("eduname") String eduname, @JsonProperty("eduurl") String eduurl, 
    @JsonProperty("eduage") String eduage) {
        this.eduname = eduname;
        this.eduurl = eduurl;
        this.eduage = eduage;
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

    public String getId() {
        return this.id;
    }

   
    
}
