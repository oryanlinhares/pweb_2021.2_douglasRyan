package com.pweb_2021_1.u2.hedoton.hedoton.repositories;

import com.pweb_2021_1.u2.hedoton.hedoton.model.Produtos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    @Query("SELECT prod FROM Produtos prod WHERE prod.nomeProduto LIKE %:nomeE% OR prod.marca LIKE %:nomeE%")
    List<Produtos> findByNome(@Param("nomeE") String nome);

    @Query("SELECT prod FROM Produtos prod WHERE prod.peso =:nomeE OR prod.altura =:nomeE OR prod.largura =:nomeE OR prod.profundidade =:nomeE OR prod.volume =:nomeE OR prod.precoCompra =:nomeE OR prod.precoVenda =:nomeE")
    List<Produtos> findByValue(@Param("nomeE") Float nome);
}