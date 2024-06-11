package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO.LivrosDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Itens {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private LivrosDTO livrosDTO;
    private Venda venda;
        @NotNull
    private int quantidade;

    public Itens(Integer id, LivrosDTO livrosDTO, Venda venda, int quantidade) {
        this.id = id;
        this.livrosDTO = livrosDTO;
        this.venda = venda;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LivrosDTO getLivrosDTO() {
        return livrosDTO;
    }

    public void setLivrosDTO(LivrosDTO livros) {
        this.livrosDTO = livrosDTO;
    }

    public Venda getVenda() {

        return venda;
    }

    public void setVenda(Venda venda) {

        this.venda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

