package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping(path = "/lab")
    public String getLabName(){
        return "this lab is named jenkins deployment";
    }
}
