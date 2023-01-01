package com.springboot.app.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @GetMapping(value = "/provider/search/{provider}")
    public String searchProvider(@PathVariable("provider")String provider){
        return provider + " Service is found";
    }

}
