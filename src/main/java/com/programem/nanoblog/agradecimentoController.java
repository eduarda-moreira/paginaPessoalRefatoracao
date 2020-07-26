package com.programem.nanoblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class agradecimentoController {
    @GetMapping("/agradecimento")
    public String agradecimento(){
        return "agradecimento";
    }
}
