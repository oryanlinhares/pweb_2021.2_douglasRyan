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
@Table(name="produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="increment")
    private long idProduto;
    private String nomeProduto;
    private String marca;
    private float altura;
    private float largura;
    private float profundidade;
    private float volume;
    private float peso;
    private float precoCompra;
    private float precoVenda;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataCadastro;

}
