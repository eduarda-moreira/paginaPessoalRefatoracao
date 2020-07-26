package com.programem.nanoblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class curiosidadesController {
    @GetMapping("/curiosidades")
    public String curiosidades(){
        return "curiosidades";
    }
}
