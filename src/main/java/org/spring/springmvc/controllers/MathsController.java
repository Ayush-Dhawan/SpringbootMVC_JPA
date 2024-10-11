package org.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MathsController {
    @PostMapping("/sum")
    public ModelAndView add(@RequestParam ("num1") int a, @RequestParam ("num2")int b, @ModelAttribute ModelAndView m) {
        m.addObject("result", a + b);
        return m;
    }
}
