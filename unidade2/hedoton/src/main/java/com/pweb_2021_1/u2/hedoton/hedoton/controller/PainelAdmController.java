package com.pweb_2021_1.u2.hedoton.hedoton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class PainelAdmController{
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
    @GetMapping("/painel")
    public ModelAndView painel(){
        ModelAndView mav = new ModelAndView("painel");
        return mav;
    }
}
