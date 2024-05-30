package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nomeEditora;

    public Editora(Integer id, String nomeEditora) {
        this.id = id;
        this.nomeEditora = nomeEditora;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getNomeEditora() {

        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {

        this.nomeEditora = nomeEditora;
    }
}
