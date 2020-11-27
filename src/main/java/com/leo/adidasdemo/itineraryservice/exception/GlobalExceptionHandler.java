package com.leo.adidasdemo.itineraryservice.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public CodeMsg exceptionHandler(HttpServletRequest request, Exception e){
        log.error(e.getMessage());
        return CodeMsg.SERVER_ERROR;
    }
}

