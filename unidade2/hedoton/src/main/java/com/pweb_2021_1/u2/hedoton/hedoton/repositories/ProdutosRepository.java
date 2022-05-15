package com.pweb_2021_1.u2.hedoton.hedoton.repositories;

import com.pweb_2021_1.u2.hedoton.hedoton.model.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}