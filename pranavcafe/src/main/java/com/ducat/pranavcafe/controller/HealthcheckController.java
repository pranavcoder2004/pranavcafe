package com.ducat.pranavcafe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {
    @GetMapping
    public String check(){
        return "Working";
    }
}
