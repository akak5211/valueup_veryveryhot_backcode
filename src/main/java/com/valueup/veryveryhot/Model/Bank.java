package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Bank{
    private final String parentid;
    private final String bankname;
    private final int account;
    private final String payment;

    @Id
    private String id;

    public String getParentid() {
        return this.parentid;
    }


    public String getBankname() {
        return this.bankname;
    }


    public int getAccount() {
        return this.account;
    }


    public String getPayment() {
        return this.payment;
    }


    public String getId() {
        return this.id;
    }



    public Bank(@JsonProperty("parentid") String parentid, @JsonProperty("bankname") String bankname,
    @JsonProperty("account") int account, @JsonProperty("payment") String payment){
        this.parentid = parentid;
        this.bankname = bankname;
        this.account = account;
        this.payment = payment;

    }

    
}