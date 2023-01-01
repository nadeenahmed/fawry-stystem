package com.springboot.app.models;

import org.springframework.stereotype.Service;

@Service
public class Transaction {
    public String id;
    public String type;
    public Transaction(){};
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
