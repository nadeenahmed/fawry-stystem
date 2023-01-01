package com.springboot.app.models;

import org.springframework.stereotype.Service;

@Service
public class Form {
    public int MobileNumber;
   public int amount;
    public String sp;
    public String id;
    public String method;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public String getSp() {
        return sp;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public int getAmount() {
        return amount;
    }
}
