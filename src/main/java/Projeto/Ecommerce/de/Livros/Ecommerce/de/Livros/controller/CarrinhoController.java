package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.CarrinhoService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Carrinho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarrinhoController {


        @Autowired
        CarrinhoService carrinhoService;
        @PostMapping("/carrinhoCadastrar")
        public void cadastrarCarrinho( @RequestBody Carrinho carrinho){
            carrinhoService.cadastrarCarrinho(carrinho);
        }

        @DeleteMapping("/carrinhoDeletar/{id}")
        public void deletarCarrinho(@PathVariable Integer id) {
            carrinhoService.deletarCarrinho (id);
        }

        @GetMapping("/carrinhoListar")
        public List<Carrinho> listarCarrinhos() {
            return carrinhoService.listarCarrinhos();
        }


        @PutMapping ("/carrinhoEditar")
        public Carrinho editarCarrinho (@RequestBody Carrinho carrinho){

            return carrinhoService.editarCarrinho(carrinho);
        }


    }


