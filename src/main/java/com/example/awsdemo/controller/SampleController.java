package com.example.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String get(){
        return "Hello All This is Our first Deployment to AWS ";
    }
}
