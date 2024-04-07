package com.example.controller;

import com.example.config.RestTemplateConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {


    @Autowired
    RestTemplateConfig restTemplate;

    @Autowired
    RetryTemplate retryTemplate;

    @GetMapping("/mentor")
    public Object getMentor() {
        String url = "http://localhost:8084/mentor";
        return retryTemplate.execute(context -> restTemplate.getForObject(url, Object.class));
    }

    @Recover
    public Object recover(RuntimeException ex) {
        System.out.println("Failed to call mentor after maximum retries!");
        throw new RuntimeException("Failed to call mentor", ex);
    }
}
