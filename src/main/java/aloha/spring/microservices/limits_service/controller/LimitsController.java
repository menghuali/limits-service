package aloha.spring.microservices.limits_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import aloha.spring.microservices.limits_service.bean.Limits;
import aloha.spring.microservices.limits_service.config.Configuration;


@RestController
public class LimitsController {

    private Configuration config;

    public LimitsController(Configuration config) {
        this.config = config;
    }

    @GetMapping("/limits")
    public Limits getLimits() {
        return new Limits(config.getMinimum(), config.getMaximum());
    }
    

}
