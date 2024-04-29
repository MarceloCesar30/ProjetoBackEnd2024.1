package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.AutorService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutorController {
    @Autowired
    AutorService autorService;
    @PostMapping("/autorCadastrar")
    public void cadastrarAutor( @RequestBody Autor autor){
        autorService.cadastrarAutor(autor);
    }

    @DeleteMapping("/autorDeletar/{id}")
    public void deletarAutor(@PathVariable Integer id) {
         autorService.deletarAutor (id);
    }

    @GetMapping("/AutorListar")
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }


    @PutMapping ("/autorEditar")
    public Autor editarAutor (@RequestBody Autor autor){

        return autorService.editarAutor(autor);
    }


}
