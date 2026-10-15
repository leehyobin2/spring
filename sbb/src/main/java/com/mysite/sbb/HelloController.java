package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    @GetMapping("/jump")
    @ResponseBody
    public String helloSpringBoot(){
        return "점프 투 스프링 부트";
    }

    @GetMapping("/kim")
    @ResponseBody
    public String helloSpStringBoot(){
        return "hello my name is kim";
    }
}


