package com.spring.estudio.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.estudio.demo.models.User;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public Map<String,Object> details(Model model) {
        User user = new User("Fabian", "Jaimes");
        Map<String,Object> body = new HashMap<>();
        body.put("tittle", "Hola mundo desde Sprint");
        body.put("user", user);
        return body;
    }

}
