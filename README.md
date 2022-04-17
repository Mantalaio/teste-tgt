# Teste-TGT
## APIRest para simular um cadastro para Open Banking, utilizando Java, SpringBoot e Vue.Js.

<h3 align="left"> 
	🚧  Status do projeto 🚀 Pronto  🚧
</h3>


<h3 align="left">
		Tecnologias e ferramentas utilizadas.
</h3>
  Backend:
    - Spring Boot
    - Spring MVC
    - H2 Database
    - JAVA
		- Lombok
    
  Frontend:
    - Vue 3
    - Axios
    - Bootstrap


### Requisitos.

	Para compilar e rodar está aplicação você precisa:
		- Lombok
		- Java versão 11
		- Maven
		
# Rodando a aplicação

### Clone este repositório:
 $ git clone <https://github.com/Mantalaio/teste-tgt.git>
 
 ### Acesse a pasta do projeto no terminal/cmd
 $ cd ./teste-tgt
 
 ### Instalar as dependencias da api
 
$ cd ./teste-tgt
$ mvn clean install
 
 ### Vá para a pasta server
$ cd ./server

### Instale as dependências da aplicação web
$ npm install 

### Execute a aplicação web
$ npm run serve

### O servidor iniciará na porta:8081 - acesse <http://localhost:8081> 

# A aplicação

A aplicação consiste em a API realizar um cadastro de clientes interessados no open banking. Cadastrando seus dados como: nome completo, cpf, endereço, renda e banco atual. A persistencia dos dados será feita por meio do database H2, um banco local para que não seja necessária a instalação de um banco de dados. A aplicação transmitirá a lista desses cadastrados para uma aplicação web usando a tecnologia Vue.Js para que a mesma demonstre em tela a listagem e os dados detalhados de cada cliente cadastrado.







