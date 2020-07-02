package com.example.skaffold;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class TimeController {
    @RequestMapping("/time")
    @GetMapping
    public String time() {
        return String.format("Now time is %s", Instant.now().toString());
    }

}
