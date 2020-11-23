package com.thoughtworks.capability.gtb.alice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    private final RestTemplate restTemplate;

    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello(){
        return restTemplate.getForObject("http://localhost:8081/hello", String.class);
    }
}
