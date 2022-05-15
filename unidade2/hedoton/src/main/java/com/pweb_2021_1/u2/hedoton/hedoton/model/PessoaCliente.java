package com.pweb_2021_1.u2.hedoton.hedoton.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="pessoa_cliente")
public class PessoaCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="increment")
    private long id;
    private String nome;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;
    private String genero;
    private String telefone;
    private String email;
    private String rua;
    private String numeroDaCasa;
    private String cidade;
    private String bairro;
    private String estado;
    private String cep;
}
