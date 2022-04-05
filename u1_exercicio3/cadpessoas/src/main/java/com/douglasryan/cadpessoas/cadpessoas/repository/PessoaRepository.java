package com.douglasryan.cadpessoas.cadpessoas.repository;

import org.springframework.stereotype.Repository;

import com.douglasryan.cadpessoas.cadpessoas.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}