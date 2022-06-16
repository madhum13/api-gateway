package com.mycompany.apigateway.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookServiceFallbackController {

    @GetMapping("/bsFallback")
    public String fallBackForBSCall(){
        return "Book Service temporarily unavailable";
    }
}
