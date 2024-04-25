package com.spring.estudio.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.estudio.demo.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        
        User user = new User("Fabian", "Jaimes");
        model.addAttribute("tittle", "Hola mundo desde Sprint");
        model.addAttribute("user", user);
        return "details";
    }

}
