package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Itens;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Venda;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class ItensDTO {
    private Integer id;

    private LivrosDTO livrosDTO;
    private Venda venda;

    private int quantidade;

    public ItensDTO(Integer id, LivrosDTO livrosDTO, Venda venda, int quantidade) {
        this.id = id;
        this.livrosDTO = livrosDTO;
        this.venda = venda;
        this.quantidade = quantidade;
    }
        public ItensDTO(Itens itens){
            id = itens.getId();
            livrosDTO = itens.getLivrosDTO();
            venda = itens.getVenda();
            quantidade = itens.getQuantidade();

    }
}
