package com.github.mantalaio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.mantalaio.teste.tgt.model.Cliente;
import com.github.mantalaio.teste.tgt.repository.ClienteRepositorio;


@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente1 = Cliente.builder()
			.nomeCompleto("Caio Alves Cardoso")
			.cpf("555.555.555-55")
			.endereco("Rua copaiba casa 12 - São Paulo")
			.renda("2.200,00")
			.bancoAtual("Banco do Brasil")
			.build();

		Cliente cliente2 = Cliente.builder()
			.nomeCompleto("Sora Daniel Nunes")
			.cpf("666.666.666-66")
			.endereco("Rua presidente prudente casa 5 - São Paulo")	
			.renda("5.000,00")
			.bancoAtual("Bradesco")
			.build();
			

		Cliente cliente3 = Cliente.builder()
			.nomeCompleto("Tony Stark")
			.cpf("777.777.777-77")
			.endereco("SHVP Casa 12 - Brasília")
			.renda("10.000,00")
			.bancoAtual("Santander")
			.build();

			clienteRepositorio.save(cliente1);
			clienteRepositorio.save(cliente2);
			clienteRepositorio.save(cliente3);
	}

}
