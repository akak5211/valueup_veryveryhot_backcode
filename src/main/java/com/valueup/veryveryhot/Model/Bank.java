package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Bank{
    private final String parentid;
    private final String bankname;
    private final int account;
    private final int balance;

    @Id
    private String id;

    public Bank(@JsonProperty("parentid") String parentid, @JsonProperty("bankname") String bankname, @JsonProperty("balance") int balance,
    @JsonProperty("account") int account){
        this.parentid = parentid;
        this.bankname = bankname;
        this.account = account;
        this.balance = balance;
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

    public int getBalance(){
        return this.balance;
    }

    public String getId() {
        return this.id;
    }
    
}