package com.pweb_2021_1.u2.hedoton.hedoton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class ProdutosController {
    @GetMapping("/produtos")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("produtos");
        return mav;
    }
}
