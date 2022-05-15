package com.pweb_2021_1.u2.hedoton.hedoton.repositories;

import com.pweb_2021_1.u2.hedoton.hedoton.model.PessoaCliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<PessoaCliente, Long>{
    
}
