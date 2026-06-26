package com.example.healthapi;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health-check")
    public Map<String, String> healthCheck(){
        return Map.of("status", "ok");
    }
    
}
