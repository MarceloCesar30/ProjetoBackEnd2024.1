package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String autor;
    private String editora;
    private String titulo;
    private int ano;

    public Livros(Integer id, String autor, String editora, String titulo, int ano) {
        this.id = id;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
        this.ano = ano;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
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
}
