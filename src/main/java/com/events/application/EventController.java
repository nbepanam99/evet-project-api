package com.events.application;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EventController {

    @GetMapping("")
    public String getAppRoot(){
        return "Event Hexagonal REST API";
    }

}
