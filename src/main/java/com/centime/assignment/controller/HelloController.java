package com.centime.assignment.controller;

import com.centime.assignment.service.HelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-two")
public class HelloController {

    private static final Logger LOG = LogManager.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> checkServiceHealth() {
        LOG.info("inside service health controller method.");
        return helloService.checkServiceHealth();
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        LOG.info("inside hello controller method.");
        return helloService.hello();
    }
}
