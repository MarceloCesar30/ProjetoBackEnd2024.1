package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;

public class AutorDTO {
    private Integer id;
    private Autor autor;

    public AutorDTO(Integer id, Autor autor) {
        this.id = id;
        this.autor = autor;
    }
    public AutorDTO(Autor autor) {

        id = autor.getId();
        autor = autor;
    }

}
