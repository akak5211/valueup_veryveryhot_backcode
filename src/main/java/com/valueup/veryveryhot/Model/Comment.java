package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Comment {

    private final String commentpeople;
    private final String commentcontent;
    private final String commentdate;
    private final String parentid;
    
    @Id
    private String id;

    public Comment(@JsonProperty("commentpeople") String commentpeople, @JsonProperty("commentcontent") String commentcontent,
    @JsonProperty("commentdate") String commentdate, @JsonProperty("parentid") String parentid){
        this.commentpeople = commentpeople;
        this.commentcontent = commentcontent;
        this.commentdate = commentdate;
        this.parentid = parentid;
    }


    public String getCommentpeople() {
        return this.commentpeople;
    }


    public String getCommentcontent() {
        return this.commentcontent;
    }


    public String getCommentdate() {
        return this.commentdate;
    }


    public String getParentid() {
        return this.parentid;
    }


    public String getId() {
        return this.id;
    }



}
