package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO.LivrosDTO;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Itens;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.LivrosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class CarrinhoService {
    LivrosRepository livrosRepository;
    ModelMapper modelMapper;

    private final List<Livros> livros = new ArrayList<>();

    public CarrinhoService(LivrosRepository livrosRepository, ModelMapper modelMapper) {
        this.livrosRepository = livrosRepository;
        this.modelMapper = modelMapper;
    }

    // Método para adicionar um produto ao carrinho pelo ID
    public void adicionarProdutoAoCarrinho(Integer id) {
        // Busca o produto pelo ID no repositório. Se não for encontrado, lança uma exceção
        Livros produto = livrosRepository.findById(id).orElseThrow();
        // Converte o objeto Produto em ProdutoDTO
        LivrosDTO livrosDTO = modelMapper.map(produto, LivrosDTO.class);

        // Percorre a lista de itens no carrinho
        for (Livros itens : livros) {
            // Se o produto já estiver no carrinho, incrementa a quantidade
            if (itens.getLivrosDTO().getId().equals(livrosDTO.getId())) {
                itens.setQuantidade((int) (itens.getVenda() + 1));
                // Atualiza o subtotal do item
                itens.setVenda(itens.getQuantidade() * livrosDTO.getValorLivro());
                return; // Sai do método após atualizar o item existente
            }
        }

    }
/*
        // Se o produto não estiver no carrinho, cria um novo item de venda
        Itens novoItem = new Itens();
        novoItem.setLivrosDTO(livrosDTO);
        novoItem.setQuantidade(1);
        novoItem.setVenda(livrosDTO.getValorLivro());
        // Adiciona o novo item à lista de itens no carrinho
        livros.add(novoItem);
    }
*/
    // Método para remover um produto do carrinho pelo ID
    public void removeProdutoDoCarrinho(Integer id) {
        // Percorre a lista de itens no carrinho
        for (int i = 0; i < livros.size(); i++) {
            Livros itens = livros.get(i);
            // Se a quantidade do item for maior que 1, decrementa a quantidade
            if (itens.getQuantidade() > 1) {
                itens.setQuantidade(itens.getQuantidade() - 1);
                // Atualiza o subtotal do item
                itens.setVenda(itens.getQuantidade() * itens.getLivroDTO().getValorLivro());
            } else {
                // Se a quantidade do item for 1, remove o item do carrinho
                livros.remove(i);
            }
            calcularValorItens(); // Recalcula o valor total dos itens no carrinho
            break; // Sai do loop após encontrar e processar o item
        }
    }

    // Método para remover todos os produtos do carrinho
    public void removerTodosProdutosDoCarrinho() {
        Livros.clear(); // Remove todos os itens do carrinho
        calcularValorItens(); // Recalcula o valor total dos itens no carrinho
    }

    // Método para aumentar a quantidade de um produto no carrinho pelo ID
    public void aumentarQuantidadeDoProdutoNoCarrinho(Integer id) {
        // Percorre a lista de itens no carrinho
        for (Livros itens : livros) {
            // Se encontrar o produto, incrementa a quantidade
            if (itens.getLivroDTO().getId().equals(id)) {
                itens.setQuantidade(itens.getQuantidade() + 1);
                calcularValorItens(); // Recalcula o valor total dos itens no carrinho
                return; // Sai do método após encontrar e processar o item
            }
        }
    }

    // Método para diminuir a quantidade de um produto no carrinho pelo ID
    public void diminuirQuantidadeDoProdutoNoCarrinho(Integer id) {
        // Percorre a lista de itens no carrinho
        Livros[] Livros = new Livros[0];
        for (Livros item : Livros) {
            // Se encontrar o produto, verifica a quantidade
            Itens itens = null;
            if (itens.getLivrosDTO().getId().equals(id)) {
                // Se a quantidade for maior que 1, decrementa a quantidade
                if (itens.getQuantidade() > 1) {
                    itens.setQuantidade(itens.getQuantidade() - 1);
                }
                calcularValorItens(); // Recalcula o valor total dos itens no carrinho
                return; // Sai do método após encontrar e processar o item
            }
        }
    }

    // Método para listar todos os itens do carrinho
    public List<Livros> listarItensDoCarrinho() {
        return livros; // Retorna a lista de itens no carrinho
    }

    // Método para listar uma cópia dos itens do carrinho
    public List<Livros> listarItensDoCarrinhoCopia() {
        return Collections.unmodifiableList(livros); // Retorna uma lista não modificável dos itens no carrinho
    }

    // Método para calcular o valor total dos itens no carrinho
    public double calcularValorItens() {
        double valorItens = 0.0;

        // Percorre a lista de itens no carrinho
        for (Livros item : livros) {
            // Soma o valor de cada item (quantidade * valor de venda)
            Itens itens = null;
            valorItens += itens.getQuantidade() * itens.getLivrosDTO().getValorLivro();
        }

        return valorItens; // Retorna o valor total dos itens no carrinho
    }
}