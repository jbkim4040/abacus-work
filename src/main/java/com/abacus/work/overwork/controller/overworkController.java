package com.abacus.work.overwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class overworkController {

    @GetMapping("/serverInfo")
    public String retrieveServerInfo(){
        return "serverInfo";
    }
}
