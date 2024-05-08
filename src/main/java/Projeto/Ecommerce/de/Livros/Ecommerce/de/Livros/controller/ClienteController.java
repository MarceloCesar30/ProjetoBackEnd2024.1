package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.ClienteService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {


        @Autowired
        ClienteService clienteService;
        @PostMapping("/clienteCadastrar")
        public void cadastrarCliente( @RequestBody Cliente cliente){

            clienteService.cadastrarCliente(cliente);
        }

        @DeleteMapping("/clienteDeletar/{id}")
        public void deletarCliente(@PathVariable String id_Cliente) {

            clienteService.deletarCliente (id_Cliente);
        }

        @GetMapping("/ClienteListar")
        public List<Cliente> listarClientes() {

            return clienteService.listarClientes();
        }


        @PutMapping ("/clienteEditar")
        public Cliente editarcliente (@RequestBody Cliente cliente){

            return clienteService.editarCliente(cliente);
        }


    }



