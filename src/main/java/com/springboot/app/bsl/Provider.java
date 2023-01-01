package com.springboot.app.bsl;

import com.springboot.app.database.Database;
import com.springboot.app.models.Transaction;
import org.springframework.stereotype.Service;
import com.springboot.app.models.Form;

@Service
public abstract class Provider {
    public Transaction t = new Transaction();
    public Database d = new Database();
    Form f=new  Form();
    public int account=0;

    public Database getD() {
        return d;
    }

    public void setD(Database d) {
        this.d = d;
    }

    public Transaction getT() {
        return t;
    }

    public void setT(Transaction t) {
        this.t = t;
    }

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    abstract public String handle (Form form);
}
