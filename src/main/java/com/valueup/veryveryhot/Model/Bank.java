package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Bank{
    private final String parentid;
    private final String bankname;
    private final int account;

    @Id
    private String id;

    public Bank(@JsonProperty("parentid") String parentid, @JsonProperty("bankname") String bankname,
    @JsonProperty("account") int account){
        this.parentid = parentid;
        this.bankname = bankname;
        this.account = account;
    }

    public String getParentid() {
        return this.parentid;
    }


    public String getBankname() {
        return this.bankname;
    }


    public int getAccount() {
        return this.account;
    }

    public String getId() {
        return this.id;
    }
    
}