package com.pweb_2021_1.u2.hedoton.hedoton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class PedidosController {
    @GetMapping("/pedidos")
    public ModelAndView listarPedidos(){
        ModelAndView mav = new ModelAndView("pedidos");
        return mav;
    }
}
