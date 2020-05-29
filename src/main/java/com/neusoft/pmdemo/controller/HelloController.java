package com.neusoft.pmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public void test(HttpServletResponse res)
    throws Exception{
       res.getWriter().println("helllo,.........");
        //return "index";
    }
}
