package com.springboot.app.bsl;

import com.springboot.app.database.Database;
import com.springboot.app.models.Form;
import com.springboot.app.models.Transaction;
import org.springframework.stereotype.Service;

@Service
public class MobileOrange extends Provider {
    public String SpName=" MobileOrange ";
    public Transaction t = new Transaction();
    public Database d = new Database();
    Form f=new  Form();
    @Override
    public String handle(Form form)
    {
        f.setAmount(form.getAmount());
        t.setId(form.id);
        t.setType("payment transaction");
        d.transactions.add(t);
        return "Amount "+f.amount+" has been transferred to "+SpName+", transaction id is "+form.id;}

    public void setF(Form f) {
        this.f = f;
    }

    public void setSpName(String spName) {
        SpName = spName;
    }

    public String getSpName() {
        return SpName;
    }

    public Transaction getT() {
        return t;
    }

    public Form getF() {
        return f;
    }

    public void setT(Transaction t) {
        this.t = t;
    }

    public void setD(Database d) {
        this.d = d;
    }

    public Database getD() {
        return d;
    }
}
