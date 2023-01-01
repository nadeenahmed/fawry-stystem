package com.springboot.app.controllers;

import com.springboot.app.bsl.Authentication;
import com.springboot.app.models.Admin;
import com.springboot.app.models.Transaction;
import com.springboot.app.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AuthenticationController {
    Authentication auth=new Authentication();
    public AuthenticationController(Authentication auth){this.auth=auth;}
public AuthenticationController(){};
    public void setAuth(Authentication auth) {
        this.auth = auth;
    }

    public Authentication getAuth() {
        return auth;
    }

    @PostMapping(value = "/User/signup")
    public String userSignUp(@RequestBody User user){return auth.userSignUp(user);}
    @PostMapping(value = "/User/login")
    public String userLogIn(@RequestBody User user){return auth.userLogIn(user);}
    @PostMapping(value = "/Admin/signup")
    public String adminSignUp(@RequestBody Admin admin){return auth.adminSignUp(admin);}
    @PostMapping(value = "/Admin/login")
    public String adminLogIn(@RequestBody Admin admin){return auth.adminLogIn(admin);}
    @GetMapping(value = "/User/{email}")
    public User getUser(@PathVariable("email")String email){return auth.getUser(email);}
    @GetMapping(value = "/Admin/{email}")
    public Admin getAdmin(@PathVariable("email")String email){return auth.getAdmin(email);}

}
