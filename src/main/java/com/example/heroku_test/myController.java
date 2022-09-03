package com.example.heroku_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    @GetMapping("/home")
    String all() {
        return "hello heroku";
    }
}
