package com.altimetrik.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for Hello World endpoint.
 */
@RestController
public class HelloWorldController {
    
    /**
     * Returns a Hello World message.
     * 
     * @return String with Hello World message
     */
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}