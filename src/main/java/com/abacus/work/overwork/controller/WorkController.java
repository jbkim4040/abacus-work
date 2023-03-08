package com.abacus.work.overwork.controller;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;

@RestController
@NoArgsConstructor
public class WorkController {

    @GetMapping("/{workDt}")
    public String retrieveWork(@PathVariable String workDt){
        return String.format("It's Working in User Service" +
                ", port(local.server.port)=" +
                "");
    }

    @GetMapping("/")
    public String retrieveAllWorks(){
        return String.format("It's Working in User Service" +
                ", port(local.server.port)=" +
                "");
    }

    @PostMapping("/{workDt}")
    public String saveWork(@PathVariable String workDt, HttpRequest request){
        return String.format("It's Working in User Service" +
                ", port(local.server.port)=" +
                "");
    }

    @PostMapping("/")
    public String saveWorks(){
        return String.format("It's Working in User Service" +
                ", port(local.server.port)=" +
                "");
    }

    @DeleteMapping("/{workDt}")
    public String deleteWork(@PathVariable String workDt, HttpRequest request){
        return String.format("It's Working in User Service" +
                ", port(local.server.port)=" +
                "");
    }
    @DeleteMapping("/")
    public String deleteWorks(){
        return String.format("It's Working in User Service" +
                ", port(local.server.port)=" +
                "");
    }
}
