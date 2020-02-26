package com.example.awsTest;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class ServiceApi implements ErrorController {
    public static final String ERROR = "/error";
    public static final String INFO = "/info";

    @Override
    public String getErrorPath() {
        return ERROR;
    }

    @RequestMapping(INFO)
    public String status(HttpServletRequest request) {
        MDC.clear();
        log.info("IP:{}",request.getRemoteAddr());
        log.info("getRequestURL:{}",request.getRequestURL());
        log.info("getRequestURI:{}",request.getRequestURI());
        log.info("getRemotePort:{}",request.getRemotePort());
        log.info("getRemoteUser:{}",request.getRemoteUser());
        log.info("getRemoteHost:{}",request.getRemoteHost());
        log.info("get user agent:{}",request.getHeader("User-Agent"));
        return "{ \"test\":\"ok\"}";
    }

    @RequestMapping(ERROR)
    public String error()  {
        MDC.clear();
        return "wrong request";
    }
}
