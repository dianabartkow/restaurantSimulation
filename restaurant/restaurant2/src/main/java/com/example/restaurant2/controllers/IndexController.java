package com.example.restaurant2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/welcome")
    public String index(Model model){
        model.addAttribute("name","blabla");
        return"index";
    }
}
