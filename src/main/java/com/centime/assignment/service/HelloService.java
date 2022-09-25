package com.centime.assignment.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.actuate.health.Health;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final Logger LOG = LogManager.getLogger(HelloService.class);

    public ResponseEntity<String> checkServiceHealth() {
        LOG.info("inside service up service method.");
        return new ResponseEntity<>(Health.up().build().getStatus().toString(), HttpStatus.OK);
    }

    public ResponseEntity<String> hello() {
        LOG.info("inside hello service method.");
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
