package com.github.mantalaio.teste.tgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.mantalaio.teste.tgt.model.Cliente;
                             
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> { 

    
}
