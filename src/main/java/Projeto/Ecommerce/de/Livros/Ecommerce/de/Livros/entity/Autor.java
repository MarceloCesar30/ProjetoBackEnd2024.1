package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autor {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String autor;

    public Autor(int id, String autor){
        this.id = id;
        this.autor = autor;

    }
    public Autor(){}
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
