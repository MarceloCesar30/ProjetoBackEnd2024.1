package entity;

import jakarta.persistence.GenerationType;

@entity
public class Autor {
    @id
    @generatedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomeAutor;

    public Autor(int id, String nomeAutor, int anoNascimento){
        this.id = id;
        this.nomeAutor = nomeAutor;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

}
