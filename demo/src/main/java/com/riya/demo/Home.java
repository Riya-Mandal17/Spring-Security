package com.riya.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public String greet(HttpServletRequest resquest){
        return "Welcom to my page" + resquest.getSession().getId();
    }
}
