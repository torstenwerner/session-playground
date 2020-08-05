package com.example.session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Countcontroller {

    @Autowired
    private CounterService counterService;


    @GetMapping("/count")
    public int count() {
        return counterService.getCounter();
    }
}
