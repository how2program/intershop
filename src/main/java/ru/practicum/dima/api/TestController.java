package ru.practicum.dima.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String hello() {
        return "HELLO, YOPTA!";
    }

}
