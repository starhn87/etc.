package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BasicController {

    /**
     * 기본 페이지 컨트롤러
     * 
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String requestMethodName() throws Exception {
        throw new NullPointerException("test");
        // return "index";
    }

}