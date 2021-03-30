package com.hours22.cd.helloworld.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/")
    public String ping(){
        return "Success";
    }
}
