package ru.practicum.dima.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping
    public String hello() {
        return "counter";
    }

}