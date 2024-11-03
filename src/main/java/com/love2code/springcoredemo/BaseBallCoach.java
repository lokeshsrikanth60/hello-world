package com.love2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getdailyworkout() {
        return "Practice bat swinging for 15 min";
    }
}
