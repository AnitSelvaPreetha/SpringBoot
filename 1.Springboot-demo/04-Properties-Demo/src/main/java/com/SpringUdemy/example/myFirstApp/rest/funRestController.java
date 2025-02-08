package com.SpringUdemy.example.myFirstApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    //inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose new endpoints for team info

    @GetMapping("/teaminfo")
    public String getTeamInnfo()
    {
        return "Coach: " + coachName + ", Team :" + teamName;
    }

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
