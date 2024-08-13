package com.example.mvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String showHomePage(Model model) {
        return "user/home";
    }

    @GetMapping("/showPage403")
    public String showPage403(Model model) {
        return "error/page403";
    }
}
