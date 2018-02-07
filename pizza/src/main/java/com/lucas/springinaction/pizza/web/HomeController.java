package com.lucas.springinaction.pizza.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: liucaisi
 * @date: 2018/2/7
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String redirectToFlow() {
        return "redirect:/pizza";
    }
}