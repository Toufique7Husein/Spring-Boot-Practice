package com.llv2.mycoolapp.rest;

import com.llv2.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(Coach coach) {
        this.myCoach = coach;
    }

    @GetMapping("/dailyWorkOut")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkOut();
    }

}
