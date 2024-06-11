package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.CarrinhoService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Carrinho;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarrinhoControlLer {
    CarrinhoService carrinhoService;

    public CarrinhoControlLer(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
    }

    // Método para listar todos os itens do carrinho
    @GetMapping("/listarItensDoCarrinho")
    public Carrinho listarItensDoCarrinho() {
        // Cria um novo objeto CarrinhoCompra
        Carrinho carrinhoCompra = new Carrinho();
        // Obtém a lista de itens do carrinho através do serviço carrinhoService
        List<Livros> itens = carrinhoService.listarItensDoCarrinho();
        // Define os itens do carrinho no objeto carrinhoCompra
        carrinhoCompra.setLivros(carrinhoService.listarItensDoCarrinho());
        // Define o total do carrinho calculando o valor dos itens
        carrinhoCompra.setTotal(carrinhoService.calcularValorItens());
        // Retorna o objeto carrinhoCompra
        return carrinhoCompra;
    }

    // Método para listar uma cópia dos itens do carrinho
    @GetMapping("/listarItensDoCarrinhoCopia")
    public Carrinho listarItensDoCarrinhoCopia() {
        // Cria um novo objeto CarrinhoCompra
        Carrinho carrinhoCompra = new Carrinho();
        // Obtém a lista de itens do carrinho através do serviço carrinhoService
        List<Livros> livros = carrinhoService.listarItensDoCarrinho();
        // Define os itens do carrinho no objeto carrinhoCompra
        carrinhoCompra.setLivros(carrinhoService.listarItensDoCarrinho());
        // Define o total do carrinho calculando o valor dos itens
        carrinhoCompra.setTotal(carrinhoService.calcularValorItens());
        // Retorna o objeto carrinhoCompra
        return carrinhoCompra;
    }

    // Método para adicionar um produto ao carrinho pelo ID
    @PostMapping("/adicionarItemAoCarrinho/{id}")
    public void adicionarProdutoAoCarrinho(@PathVariable Integer id) {
        // Chama o serviço carrinhoService para adicionar o produto ao carrinho
        carrinhoService.adicionarProdutoAoCarrinho(id);
    }

    // Método para remover um produto do carrinho pelo ID
    @DeleteMapping("/removerItemDoCarrinho/{id}")
    public void removerProdutoDoCarrinho(@PathVariable Integer id) {
        // Chama o serviço carrinhoService para remover o produto do carrinho
        carrinhoService.removeProdutoDoCarrinho(id);
    }

    // Método para remover todos os produtos do carrinho
    @DeleteMapping("/removerTodosOsItensDoCarrinho")
    public void removerTodosProdutosDoCarrinho() {
        // Chama o serviço carrinhoService para remover todos os produtos do carrinho
        carrinhoService.removerTodosProdutosDoCarrinho();
    }

    // Método para aumentar a quantidade de um produto no carrinho pelo ID
    @PostMapping("/aumentarItemNoCarrinho/{id}")
    public void aumentarQuantidadeDoProdutoNoCarrinho(@PathVariable Integer id) {
        // Chama o serviço carrinhoService para aumentar a quantidade do produto no carrinho
        carrinhoService.aumentarQuantidadeDoProdutoNoCarrinho(id);
    }

    // Método para diminuir a quantidade de um produto no carrinho pelo ID
    @PostMapping("/diminuirItemNoCarrinho/{id}")
    public void diminuirQuantidadeDoProdutoNoCarrinho(@PathVariable Integer id) {
        // Chama o serviço carrinhoService para diminuir a quantidade do produto no carrinho
        carrinhoService.diminuirQuantidadeDoProdutoNoCarrinho(id);
    }
}
