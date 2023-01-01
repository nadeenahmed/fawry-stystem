package com.springboot.app.controllers;

import com.springboot.app.bsl.*;
import com.springboot.app.database.Database;
import com.springboot.app.models.*;
import org.springframework.web.bind.annotation.*;
import com.springboot.app.models.Transaction;
import com.springboot.app.bsl.TransactionBsl;
import java.util.ArrayList;

@RestController

public class HandlerController {
    TransactionBsl trans = new TransactionBsl();
    Transaction t = new Transaction();
    Database d = new Database();
    public HandlerController(Transaction t, Database d, TransactionBsl trans){
        this.trans = trans;
        this.d = d;
        this.t  = t;
    }
    @PostMapping(value = "/handle")
    public String handle(@RequestBody Form form)
    {
        if (form.sp.equals("MobileWe")) {
            Provider m = new MobileWe();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        } else if (form.sp.equals("MobileVodafone")) {
            Provider m = new MobileVodafone();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("MobileOrange")) {
            Provider m = new MobileOrange();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("MobileEtisalat")) {
            Provider m = new MobileEtisalat();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("LandlineQuarter")) {
            Provider m = new LandlineQuarter();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("LandlineMonthly")) {
            Provider m = new LandlineMonthly();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("InternetWe")) {
            Provider m = new InternetWe();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("InternetVodafone")) {
            Provider m = new InternetVodafone();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("InternetOrange")) {
            Provider m = new InternetOrange();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("InternetEtisalat")) {
            Provider m = new InternetEtisalat();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("DonationSchool")) {
            Provider m = new DonationSchool();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("DonationNGO")) {
            Provider m = new DonationNGO();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        else if (form.sp.equals("DonationCancer")) {
            Provider m = new DonationCancer();
            if (form.method.equals("Wallet")){
                Wallet w = new Wallet();
                w.fund+= form.amount;
                return m.handle(form);
            }
            else if (form.method.equals("Credit")) {
                Credit c = new Credit();
                c.fund+= form.amount;
                return m.handle(form);
            }
        }
        return null;
    }
    @PostMapping(value = "User/request")
    public String requestRefund(@RequestParam String id){return trans.requestRefund(id);}
    @PostMapping(value = "User/check")
    public String checkRequest(@RequestParam String id){return trans.checkRequest(id);}
    @PostMapping(value = "Admin/approve")
    public String approveRefund(@RequestParam String id){return trans.approveRefund(id);}
    @PostMapping(value = "Admin/reject")
    public String rejectRefund(@RequestParam String id){return trans.rejectRefund(id);}
    @GetMapping(value = "/Admin/req")
    public ArrayList<String> listRequests(){return trans.listRequests();}
    @PostMapping(value = "/addFund")
    public String addFund(@RequestParam int amount){return trans.addFund(amount);}
    @PostMapping (value = "/addDiscount")
    public String addDiscount(@RequestBody Discount dis){return trans.addDiscount(dis);}
    @GetMapping (value = "/discounts")
    public ArrayList<Discount> listDiscounts(){return trans.listDiscounts();}
    @PostMapping (value = "/addRequest")
    public String addRequest(@RequestParam String id){return trans.addRequest(id);}
    @PostMapping (value = "addTrans")
    public String addTransaction(@RequestBody Transaction t){return trans.addTransaction(t);}
    @GetMapping(value = "/Admin/trans")
    public ArrayList<Transaction> listTransactions(){return trans.listTransactions();}
}
