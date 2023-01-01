package com.springboot.app.bsl;
import com.springboot.app.database.Database;
import com.springboot.app.models.User;
import com.springboot.app.models.Admin;
import org.springframework.stereotype.Service;

@Service
public class Authentication {
    public Database getD() {
        return d;
    }

    public void setD(Database d) {
        this.d = d;
    }

    Database d = new Database();
    public Authentication(){};
    public Authentication(Database d){this.d=d;}


    public String userSignUp(User user) {
        for(User i:d.users) {
            if (i.getEmail().equals(user.getEmail()))
                return "Log in";
        }
        d.users.add(user);
        return "Added Successfully";
    }
    public String userLogIn(User user){
        for(User i:d.users) {
            if (i.getEmail().equals(user.getEmail()))
                return "Logged in";
        }
        return "Sign up first";
    }
    public String adminSignUp(Admin admin) {
        for(Admin i:d.admins) {
            if (i.getEmail().equals(admin.getEmail()))
                return "Log in";
        }
        d.admins.add(admin);
        return "Added Successfully";
    }
    public String adminLogIn(Admin admin){
        for(Admin i:d.admins) {
            if (i.getEmail().equals(admin.getEmail()))
                return "Logged in";
        }
        return "Sign up first";
    }
    public User getUser(String email){
        for(User i:d.users) {
            if (i.getEmail().equals(email))
                return i;
        }
        return null;
    }
    public Admin getAdmin(String email){
        for(Admin i:d.admins) {
            if (i.getEmail().equals(email))
                return i;
        }
        return null;
    }
}
