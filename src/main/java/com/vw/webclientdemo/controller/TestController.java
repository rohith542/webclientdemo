package com.vw.webclientdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class TestController {

    @Autowired
    private WebClient webClient;


    @GetMapping("/test")
    public String test() {

        return webClient.get().uri("https://b-h-s.spr.us00.uat.con-veh.net/csvds/v2/oemil/vin/1G6KD54Y6MU245377").retrieve().bodyToMono(String.class).block();

    }
}
