package com.Easy.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/home")
    public String admin(){
        return "admin/home";
    }

    @GetMapping("/chat")
    public String adminChat(){
        return "admin/chat";
    }

}
