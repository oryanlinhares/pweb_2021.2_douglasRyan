package com.pweb_2021_1.u2.hedoton.hedoton.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="dependente")
public class ClienteDep {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="increment")
    private long idDep;
    private String nomeDep;
    private Date dataNascimentoDep;
    private String generoDep;

}
