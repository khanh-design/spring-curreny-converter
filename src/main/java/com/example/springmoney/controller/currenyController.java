package com.example.springmoney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class currenyController {
    @GetMapping("/converter")
    public String currenyConverter() {
        return "index";
    }

    @PostMapping("/converter")
    public String convertCurrency(@RequestParam("rate") float rate, @RequestParam("usd") float usd, HttpServletRequest request) {
        float vnd = rate * usd;
        request.setAttribute("ListVnd", vnd);
        return "converter";
    }
}
