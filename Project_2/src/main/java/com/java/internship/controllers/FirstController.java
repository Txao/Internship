package com.java.internship.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/")
    public String firstPage() {
        return "first/index";
    }

    @GetMapping("/second")
    public String secondPage() {
        return "first/second";
    }
}