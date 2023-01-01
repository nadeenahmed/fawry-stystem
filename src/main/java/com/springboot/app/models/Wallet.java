package com.springboot.app.models;

import org.springframework.stereotype.Service;

@Service
public class Wallet implements Payment{
    public int fund=0;
    public int amount;
    String method="";
    public void setMethod(){
        method="Wallet";
    };

    public int getAmount() {
        return amount;
    }

    public int getFund() {
        return fund;
    }

    public String getMethod() {
        return method;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
