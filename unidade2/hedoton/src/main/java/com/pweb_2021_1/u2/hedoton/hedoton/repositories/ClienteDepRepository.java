package com.pweb_2021_1.u2.hedoton.hedoton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pweb_2021_1.u2.hedoton.hedoton.model.ClienteDep;

@Repository
public interface ClienteDepRepository extends JpaRepository<ClienteDep, Long>{
    
}
