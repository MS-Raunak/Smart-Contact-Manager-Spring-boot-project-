package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
       System.out.println("HomePage handler loading...");
        model.addAttribute("title", "Welcome to Homepage");
        model.addAttribute("name", "Raunak Agrawal");
        model.addAttribute("github", "https://github.com/MS-Raunak");
        return "home";
    }

    
    //About page route
    @RequestMapping("/about")
    public String about() {
        System.out.println("About page loading...");
        return "about";
    }

    //Services page route
    @RequestMapping("/service")
    public String services() {
        System.out.println("Service page loading...");
        return "service";
    }
    
    
}
