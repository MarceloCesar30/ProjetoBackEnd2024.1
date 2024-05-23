package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.AutorService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.AutorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

//@Controller
@RestController
public class AutorController {
    @Autowired
    AutorService autorService;

    @PostMapping("/autorCadastrar")
    public void cadastrarAutor(@RequestBody Autor autor) {

        autorService.cadastrarAutor(autor);
    }


    @PutMapping("/autorEditar")
    public void editarAutor(@RequestBody Autor autor) {
        autorService.editarAutor(autor);
    }
    @DeleteMapping("/autorDeletar/{id}")
    public void deletarAutor(@PathVariable Integer id) {

        autorService.deletarAutor(id);
    }

    @GetMapping("/AutorListar")
    public List<Autor> listarAutores() {

        return autorService.listarAutores();
    }

}


