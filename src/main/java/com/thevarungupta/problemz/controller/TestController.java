package com.thevarungupta.problemz.controller;

import com.thevarungupta.problemz.service.query.ProblemzQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ProblemzQueryService service;

    @GetMapping
    public String test(){
        service.sampleData();
        return "saved";
    }
}
