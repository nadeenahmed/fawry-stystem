package com.springboot.app.bsl;
import com.springboot.app.database.Database;
import com.springboot.app.models.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;

@Service
public class TransactionBsl {
    Wallet w = new Wallet();
    Credit c = new Credit();
    Database d = new Database();
    Transaction t = new Transaction();
    String i = "";
    public String requestRefund(String id){
        for(Transaction t: d.transactions) {
            if (t.getId().equals(id)){
                d.requests.add(id);
                return "Request Added";
            }
        }
        return "Wrong transaction id";
    }
    public String approveRefund(String id){
        User u = new User();
        for(Transaction t: d.transactions) {
            if (t.getId().equals(id)){
                u.refundStatus=true;
                d.requests.remove(id);
                t.setId(id);
                t.setType("Refund transaction");
                d.transactions.add(t);
                return "Request Approved";
            }
        }
        return "Wrong transaction id";
    }
    public String rejectRefund(String id){
        User u = new User();
        for(Transaction t: d.transactions) {
            if (t.getId().equals(id)){
                u.refundStatus=false;
                d.requests.remove(id);
                return "Request Rejected";
            }
        }
        return "Wrong transaction id";
    }
    public String checkRequest(String id){
        for(User i: d.users) {
            if (i.refundStatus)
                return "Request is Approved";
        }
        return "Request is Rejected";
    }
    public ArrayList<Transaction> listTransactions(){
        return d.transactions;
    }
    public ArrayList<String> listRequests(){
        return d.requests;
    }
    public String addFund(int amount){
        w.fund+=amount;
        t.setId(i);
        t.setType("Add to wallet transaction");
        d.transactions.add(t);
        return "Your fund now is " + w.fund;
    }
    public String addRequest( String id){
        d.requests.add(id);
        return "Request added";}
public String addDiscount(Discount dis){
        d.discounts.add(dis);
        return "Discount added";
}
    public ArrayList<Discount> listDiscounts(){
        return d.discounts;
    }
    public String addTransaction(Transaction t){
        d.transactions.add(t);
        return "Transaction added";
    }
}
