package com.thoughtworks.capability.gtb.bob;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello(){
        return "Hello from Bob!";
    }
}
