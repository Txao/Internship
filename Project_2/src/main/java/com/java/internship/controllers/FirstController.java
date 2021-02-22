package com.java.internship.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {
    @GetMapping("/first")
    public String firstPage() {
        return "first/index";
    }

    @GetMapping("/second")
    public String secondPage(@RequestParam(value = "name", required = false) String name,
                             @RequestParam(value = "surname", required = false) String surname,
                             Model model) {

        model.addAttribute("message", "Hello " + name + " " + surname);

        return "first/second";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("x") int x, @RequestParam("y") int y,
                             @RequestParam("z") char z, Model model) {

        int result = 0;

        switch (z) {
            case '+':
                result = x + y;
                break;

            case '-':
                result = x - y;
                break;

            case '*':
                result = x * y;
                break;

            case '/':
                result = x / y;
                break;
        }

        model.addAttribute("result", "Result: " + result);
        return "first/calculator";
    }
}
