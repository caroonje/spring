package com.bitc.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping
    public String index()throws Exception{
        return "index";
    }

}
