package com.valueup.veryveryhot.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Qna{

    private final String qnatitle;
    private final String qnapeople;
    private final String qnacontent;
    private final String parentid;
    private final int likerate;
    private final int qnarate;
    private final String qnadate;
    private final List<String> likepeople;

    @Id
    private String id;

    public Qna(@JsonProperty("qnatitle") String qnatitle, @JsonProperty("qnapeople") String qnapeople,
    @JsonProperty("qnacontent") String qnacontent, @JsonProperty("parentid") String parentid,
    @JsonProperty("likerate") int likerate, @JsonProperty("qnarate") int qnarate,
    @JsonProperty("qnadate") String qnadate, @JsonProperty("likepeople") List<String> likepeople) {
        this.qnatitle = qnatitle;
        this.qnapeople = qnapeople;
        this.qnacontent = qnacontent;
        this.parentid = parentid;
        this.likerate = likerate;
        this.qnarate = qnarate;
        this.qnadate = qnadate;
        this.likepeople = likepeople;
        
    }


    public String getQnatitle() {
        return this.qnatitle;
    }


    public String getQnapeople() {
        return this.qnapeople;
    }


    public String getQnacontent() {
        return this.qnacontent;
    }


    public String getParentid() {
        return this.parentid;
    }


    public int getLikerate() {
        return this.likerate;
    }


    public int getQnarate() {
        return this.qnarate;
    }

    
    public String getQnadate(){
        return this.qnadate;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getLikepeople() {
        return this.likepeople;
    }
    
    
}
