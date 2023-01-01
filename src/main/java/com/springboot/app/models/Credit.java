package com.springboot.app.models;

import org.springframework.stereotype.Service;

@Service
public class Credit implements Payment{
   public String method="";
    public int fund;

    public void setMethod(String method) {
        this.method = method;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public int getFund() {
        return fund;
    }

    public void setMethod(){
        method="Credit";
    };

    public String getMethod() {
        return method;
    }

}
