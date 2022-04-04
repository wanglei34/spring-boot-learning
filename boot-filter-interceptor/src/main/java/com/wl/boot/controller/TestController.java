package com.wl.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 17997
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpSession session){
        //操作request的attribute
        request.setAttribute("a","a");
        request.setAttribute("a","b");
        request.getAttribute("a");
        request.removeAttribute("a");

        //操作session的attribute
        session.setAttribute("a","a");
        session.getAttribute("a");
        session.invalidate();

        return "hello world---";
    }
}
