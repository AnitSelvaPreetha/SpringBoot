package com.example.springcoredemo.common;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwimCoach implements Coach{

    public SwimCoach()
    {
        System.out.println("In Constructor :" +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warmup!";
    }
}
