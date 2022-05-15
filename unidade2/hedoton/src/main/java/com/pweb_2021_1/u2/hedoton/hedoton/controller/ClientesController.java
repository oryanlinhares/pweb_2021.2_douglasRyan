package com.pweb_2021_1.u2.hedoton.hedoton.controller;

import com.pweb_2021_1.u2.hedoton.hedoton.model.PessoaCliente;
import com.pweb_2021_1.u2.hedoton.hedoton.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping
public class ClientesController{

    @Autowired
    ClienteRepository clienteRepo;

    @GetMapping("/cadastrarClientes")
    public ModelAndView cadastrarClientes(){
        ModelAndView mav = new ModelAndView("cadastrarClientes");
        PessoaCliente cliente = new PessoaCliente();
        mav.addObject("cliente", cliente);
        return mav;
    }

    @GetMapping("/clientes")
    public ModelAndView listarClientes(){
        ModelAndView mav = new ModelAndView("clientes");
        mav.addObject("clientes", clienteRepo.findAll());
        return mav;
    }
    
    @GetMapping("/cadastrarDependente")
    public ModelAndView cadastrarDependente(){
        ModelAndView mav = new ModelAndView("cadastrarDependente");
        return mav;
    }

    @PostMapping("/cadastrarCliente")
    public String cadastrarCliente(PessoaCliente cliente){
        clienteRepo.save(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editar/{id}")
    public ModelAndView editarCliente(@PathVariable Long id) throws Exception {
        ModelAndView mav = new ModelAndView("cadastrarCliente");
        PessoaCliente cliente = clienteRepo.findById(id).orElseThrow();
        mav.addObject("cliente", cliente);
        return mav;
    }

    @GetMapping("/editarCliente/{id}")
    public String clienteEditar(@PathVariable Long id, PessoaCliente cliente){
        PessoaCliente novoCliente = clienteRepo.findById(id).orElseThrow();
        novoCliente.setNome(cliente.getNome());
        novoCliente.setDataNascimento(cliente.getDataNascimento());
        novoCliente.setBairro(cliente.getBairro());
        novoCliente.setCep(cliente.getCep());
        novoCliente.setCidade(cliente.getCidade());
        novoCliente.setEmail(cliente.getEmail());
        novoCliente.setEstado(cliente.getEstado());
        novoCliente.setGenero(cliente.getGenero());
        novoCliente.setRua(cliente.getRua());
        novoCliente.setNumeroDaCasa(cliente.getNumeroDaCasa());
        novoCliente.setTelefone(cliente.getTelefone());
        clienteRepo.save(novoCliente);
        return "redirect:/clientes";
    }

    @GetMapping("/excluir/{id}")
    public String excluirCliente(@PathVariable Long id) {
        clienteRepo.deleteById(id);
        return "redirect:/clientes";
    }
    
    

}