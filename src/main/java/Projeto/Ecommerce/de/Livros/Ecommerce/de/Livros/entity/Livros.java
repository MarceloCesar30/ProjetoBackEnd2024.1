package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO.LivrosDTO;
import jakarta.persistence.*;

@Entity
public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private  Autor autor;
    @OneToOne
    private Editora editora;
    private String titulo;
    private int ano;

    private boolean destaques;
    private String descricao;
    private Double valorLivro;
    private int quantidade;
    private double venda;
    private LivrosDTO livrosDTO;

    public Livros(Integer id, Autor autor, Editora editora, String titulo, int ano, boolean destaques,String descricao, Double valorLivro, int quantidade, double venda, LivrosDTO livrosDTO) {
        this.id = id;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
        this.ano = ano;
        this.destaques = destaques;
        this.descricao = descricao;
        this.valorLivro = valorLivro;
        this.quantidade = quantidade;
        this.venda = venda;
        this.livrosDTO = livrosDTO;

    }

    public Livros() {
    }

    public static void clear() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDestaques() {
        return destaques;
    }

    public void setDestaques(boolean destaques) {
        this.destaques = destaques;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Editora geteditora() {
        return editora;
    }

    public Double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(Double valorLivro) {
        this.valorLivro = valorLivro;
    }

    public Livros getLivroDTO() {
        
        return livrosDTO;
    }

    public int getQuantidade() {
        return quantidade;
        
    }

    public void setQuantidade(int i) {
        this.quantidade = quantidade;
    }

    public void setVenda(double v) {
    }

    public Livros getLivrosDTO() {
        return livrosDTO;
    }

    public double getVenda() {
        return venda;
    }
}
