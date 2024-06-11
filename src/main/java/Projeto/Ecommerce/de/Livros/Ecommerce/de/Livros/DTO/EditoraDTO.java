package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Editora;

public class EditoraDTO {
    private Integer id;

    private String nomeEditora;;

    public EditoraDTO(Integer id, String nomeEditora) {
        this.id = id;
        this.nomeEditora = nomeEditora;
    }
    public EditoraDTO(Editora editora) {
        id = editora.getId();
        nomeEditora = editora.getNomeEditora();
    }
    public EditoraDTO(){}

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
