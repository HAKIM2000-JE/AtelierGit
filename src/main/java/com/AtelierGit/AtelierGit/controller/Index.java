package com.AtelierGit.AtelierGit.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Index {


    @GetMapping("/")
    public static  String index () {
        return "<h1>Bonjour, je  suis le developpeur , je viens de modifier le projet!</h1>";
    }


}
