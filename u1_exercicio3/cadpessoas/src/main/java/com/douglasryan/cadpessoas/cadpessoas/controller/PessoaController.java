package com.douglasryan.cadpessoas.cadpessoas.controller;

import java.util.List;

import com.douglasryan.cadpessoas.cadpessoas.model.Pessoa;
import com.douglasryan.cadpessoas.cadpessoas.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")

public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepo;

    @GetMapping
    public String index() {
        System.out.println(pessoaRepo.findAll());
        System.out.println("Presente");
        return "index.html";
    }

    @GetMapping("adicionarPessoa")
    public ModelAndView adicionarPessoa() {
        ModelAndView mav = new ModelAndView("adicionarPessoa");
        Pessoa pessoa = new Pessoa();
        mav.addObject("pessoa", pessoa);
        return mav;
    }

    @PostMapping("adicionarPessoa")
    public String addPessoa(Pessoa pessoa) {
        pessoaRepo.save(pessoa);
        return "redirect:/public/adicionadaComSucesso.html";
    }

    @GetMapping("listarPessoas")
    public ModelAndView listarPessoa() {
        ModelAndView mav = new ModelAndView("listarPessoas");
        List<Pessoa> listarPessoas = pessoaRepo.findAll();
        mav.addObject("listarPessoas", listarPessoas);
        return mav;
    }

    @GetMapping("editar/{id}")
    public ModelAndView editar(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView("editarPessoa");
        Pessoa pessoa = pessoaRepo.getById(id);
        mav.addObject("pessoa", pessoa);
        return mav;
    }

    @PostMapping("editar/{id}")
    public String editarPessoa(@PathVariable Long id, Pessoa front){
        Pessoa pessoa = pessoaRepo.getById(id);
        pessoa.setNome(front.getNome());
        pessoa.setDataNascimento(front.getDataNascimento());
        System.out.println(front.getDataNascimento());
        pessoa.setEmail(front.getEmail());
        pessoa.setSexo(front.getSexo());
        pessoaRepo.save(pessoa);
        return "redirect:/listarPessoas";
    }

    @GetMapping("remover/{id}")
    public String remover(@PathVariable Long id){
        pessoaRepo.deleteById(id);
        return "redirect:/listarPessoas";
    }

}
