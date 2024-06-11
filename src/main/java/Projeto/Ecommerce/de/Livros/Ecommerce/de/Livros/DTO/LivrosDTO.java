package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Editora;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class LivrosDTO extends Livros{

    private Integer id;

    private Autor autor;

    private Editora editora;
    private String titulo;
    private int ano;

    private boolean destaques;
    private String descricao;

    public LivrosDTO(Integer id, Autor autor, Editora editora, String titulo, int ano, boolean destaques, String descricao) {
        this.id = id;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
        this.ano = ano;
        this.destaques = destaques;
        this.descricao = descricao;
    }

    public LivrosDTO(Livros livros){
        id = livros.getId();
        autor = livros.getAutor();
        editora = livros.getEditora();
        titulo = livros.getTitulo();
        ano = livros.getAno();
        destaques = livros.isDestaques();
        descricao = livros.getDescricao();

    }
    public LivrosDTO(){}

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Autor getAutor() {
        return autor;
    }

    @Override
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public Editora getEditora() {
        return editora;
    }

    @Override
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean isDestaques() {
        return destaques;
    }

    @Override
    public void setDestaques(boolean destaques) {
        this.destaques = destaques;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
