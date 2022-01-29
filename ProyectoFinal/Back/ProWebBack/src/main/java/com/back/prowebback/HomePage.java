package com.back.prowebback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @GetMapping("/home")
    public String homePage(){
        return "Proyecto web";
    }
}
