package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;

public class Interest {
    private final String interestname;
    private final String parentid;
    
    @Id
    private String id;

    public Interest(@JsonProperty("interestname") String interestname, @JsonProperty("parentid") String parentid) {
        this.interestname = interestname;
        this.parentid = parentid;
    }
    
    public String getInterestname() {
        return this.interestname;
    }

    public String getParentid() {
        return this.parentid;
    }

    public String getId() {
        return this.id;
    }

}
