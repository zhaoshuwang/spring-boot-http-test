package com.zhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Server2 {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${app1.url.path}")
    private String path;

    @GetMapping("/test")
    public String getServer(){
        String url=path+"/hello";
        return restTemplate.getForObject(url, String.class);
    }
}
