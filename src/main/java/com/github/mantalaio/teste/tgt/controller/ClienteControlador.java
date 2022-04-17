package com.github.mantalaio.teste.tgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.mantalaio.teste.tgt.model.Cliente;
import com.github.mantalaio.teste.tgt.repository.ClienteRepositorio;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class ClienteControlador {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @GetMapping("/clientes")
    public List<Cliente> fetchClientes(){
        return clienteRepositorio.findAll();
    }
}
