package com.valueup.veryveryhot.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;

public class Payment {
    private final String category;
    private final String shopname;
    private final int amount;
    private final int balance;

    @Id
    private String id;

    public Payment(@JsonProperty("category") String category, @JsonProperty("shopname") String shopname,
    @JsonProperty("amount") int amount, @JsonProperty("balance") int balance) {
        this.category = category;
        this.shopname = shopname;
        this.amount = amount;
        this.balance = balance;

    }

    public String getCategory() {
        return this.category;
    }

    public String getShopname() {
        return this.shopname;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getId() {
        return this.id;
    }

    
}
