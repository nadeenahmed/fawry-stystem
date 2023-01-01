package com.springboot.app.database;

import com.springboot.app.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class Database {

   public ArrayList<Discount> getDiscounts() {
      return discounts;
   }

   public ArrayList<Form> getForm() {
      return form;
   }

   public void setDiscounts(ArrayList<Discount> discounts) {
      this.discounts = discounts;
   }

   public void setForm(ArrayList<Form> form) {
      this.form = form;
   }
   public ArrayList<User> users = new ArrayList<User>();
   public ArrayList<Admin> admins = new ArrayList<Admin>();
   public ArrayList<Transaction> transactions = new ArrayList<Transaction>();
   public ArrayList<Form> form = new ArrayList<>();
   public ArrayList<String> requests = new ArrayList<String>();

   public ArrayList<Admin> getAdmins() {
      return admins;
   }

   public ArrayList<String> getRequests() {
      return requests;
   }

   public ArrayList<Transaction> getTransactions() {
      return transactions;
   }

   public ArrayList<User> getUsers() {
      return users;
   }

   public void setAdmins(ArrayList<Admin> admins) {
      this.admins = admins;
   }

   public void setRequests(ArrayList<String> requests) {
      this.requests = requests;
   }

   public void setTransactions(ArrayList<Transaction> transactions) {
      this.transactions = transactions;
   }
   public void setUsers(ArrayList<User> users) {
      this.users = users;
   }
   public ArrayList<Discount> discounts = new ArrayList<Discount>();
   public Database(){};
}
