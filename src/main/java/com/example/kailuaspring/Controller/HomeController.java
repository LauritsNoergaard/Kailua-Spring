package com.example.kailuaspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/RegisterUser";
    }
    //hej jeg tester lige igen - madsen
}
