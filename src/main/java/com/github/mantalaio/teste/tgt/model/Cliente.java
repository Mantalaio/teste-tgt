package com.github.mantalaio.teste.tgt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
@Entity
@Table(name = "cliente")
        
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_completo", nullable = false) 
    private String nomeCompleto;

    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "endereco")
    private String endereco;
    
    @Column(name = "renda")
    private String renda;
    
    @Column(name = "banco_atual")
    private String bancoAtual;
    }
