<template> 
    <div class = "container"> 

        <h1 class="text-center"> Lista de Clientes </h1> 

        <table class="table table-striped">
              <thead>
                    <th> Nome Completo </th>
                    <th> Cpf </th>
                    <th> Endereço </th>
                    <th> Renda </th>
                    <th> Banco Atual </th>
              </thead>
            <tbody>
                <tr v-for="cliente in clientes" v-bind:key = "cliente.id">
                    <td> {{cliente.nomeCompleto }} </td>
                    <td> {{cliente.cpf }} </td>
                    <td> {{cliente.endereco }} </td>
                    <td> {{cliente.renda }} </td>
                    <td> {{cliente.bancoAtual }} </td>
                </tr>
            </tbody>
        </table>

    </div>


</template>

<script>
import ClienteService from '../services/ClienteService'

    export default{
        name:'MeusClientes',
        data() {
            return {
                clientes : []
            }
        },
        methods: {
            getClientes(){
                ClienteService.getClientes().then((response) =>{
                    this.clientes = response.data;
                });
            }
        },
        created() {
            this.getClientes()
        }
    }
</script>

