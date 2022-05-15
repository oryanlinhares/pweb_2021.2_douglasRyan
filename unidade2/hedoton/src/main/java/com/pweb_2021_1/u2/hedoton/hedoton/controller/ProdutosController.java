package com.pweb_2021_1.u2.hedoton.hedoton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pweb_2021_1.u2.hedoton.hedoton.model.Produtos;
import com.pweb_2021_1.u2.hedoton.hedoton.repositories.ProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping
public class ProdutosController {
    
    @Autowired
    ProdutosRepository produtoRepo;

    @GetMapping("/produtos")
    public ModelAndView listarProdutos(){
        ModelAndView mav = new ModelAndView("produtos");
        mav.addObject("produtos", produtoRepo.findAll());
        return mav;
    }
    
    @GetMapping("/cadastrarProdutos")
    public ModelAndView cadastrarProdutos(){
        ModelAndView mav = new ModelAndView("cadastrarProdutos");
        Produtos produto = new Produtos();
        mav.addObject("produto", produto);
        return mav;
    }

    @PostMapping("/cadastrarProduto")
    public String cadastrarProduto(Produtos produto){
        produtoRepo.save(produto);
        return "redirect:/produtos";
    }
}
