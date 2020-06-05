package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Controller 전역 예외 처리 핸들러
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public String handle(NullPointerException e) {
        logger.error("###########" + e.getMessage() + "###########");
        return "index";
    }
}