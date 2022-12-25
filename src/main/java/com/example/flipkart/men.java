package com.example.flipkart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class men {
    @GetMapping("/men")
    public String getData(){
        return "Please select which item you want to purchase";
    }

}
