package com.love2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getdailyworkout() {
        return "practice fast bowling ";
    }
}
