package com.example.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In construct:"+getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {
    return "Practice fast Bowling for 15 Minutes!====>";
}
}
