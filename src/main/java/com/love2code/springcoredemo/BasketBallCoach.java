package com.love2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{
    @Override
    public String getdailyworkout() {
        return "Practice ball drizzling for 15 min";
    }
}
