package com.llv2.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketeCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "practice fast bowling for 15 minuets";
    }
}
