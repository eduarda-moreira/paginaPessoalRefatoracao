package com.programem.nanoblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class euController {
    @GetMapping("/")
    public String eu(){
        return "eu";
    }
}
