package com.pweb_2021_1.u2.hedoton.hedoton.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="increment")
    private long idPedidos;
    private String formaPagamento;
    private Date dataVenda;
    private String nomeProduto;
    private int qntProduto;
    private String nomeCliente;
    private float vUni;
    private float vTotal;
    private float vComImposto;

}
/* Ao listar os pedidos, será possível visualizar o nome do cliente,
o nome do produto, a quantidade
comprada, o valor unitário, o valor total dos produtos, o total do
pedido, produtos com os valores e
quantidades, o cálculo de imposto (fixo em 12,5%) e a forma de
pagamento.
- Ao excluir a venda, o registro de produtos e de clientes não é
afetado. */