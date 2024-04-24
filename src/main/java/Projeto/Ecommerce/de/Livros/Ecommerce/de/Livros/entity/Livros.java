package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id_Livro;
    private String autor;
    private String editora;
    private String titulo;
    private int ano;

    public Livros(String id_Livro, String autor, String editora, String titulo, int ano) {
        this.id_Livro = id_Livro;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getId_Livro() {
        return id_Livro;
    }

    public void setId_Livro(String id_Livro) {
        this.id_Livro = id_Livro;
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
