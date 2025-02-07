package com.SpringUdemy.example.myFirstApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    @GetMapping("/")
    public String hello()
    {
        return "hello World";
    }

    @GetMapping("/workout")
    public String dailyWork()
    {
        return "You Complete Today Workout";
    }


}
