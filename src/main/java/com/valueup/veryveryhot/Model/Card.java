package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;

public class Card {
    private final String cardname;
    private final String cardcompany;
    private final String cardcategory;
    private final String cardcontent;
    private final String cardimageurl;
    private final int cardpoint;

    @Id
    private String id;

    public Card(@JsonProperty("cardname") String cardname, @JsonProperty("cardcompany") String cardcompany, 
    @JsonProperty("cardcategory") String cardcategory, @JsonProperty("cardcontent") String cardcontent, 
    @JsonProperty("cardimageurl") String cardimageurl, @JsonProperty("cardpoint") int cardpoint) {
        this.cardname = cardname;
        this.cardcompany = cardcompany;
        this.cardcategory = cardcategory;
        this.cardcontent = cardcontent;
        this.cardimageurl = cardimageurl;
        this.cardpoint = cardpoint;
    }

    public String getCardname() {
        return this.cardname;
    }


    public String getCardcompany() {
        return this.cardcompany;
    }


    public String getCardcategory() {
        return this.cardcategory;
    }


    public String getCardcontent() {
        return this.cardcontent;
    }


    public String getCardimageurl() {
        return this.cardimageurl;
    }

    public int getCardpoint() {
        return this.cardpoint;
    }

    public String getId() {
        return this.id;
    }

}
